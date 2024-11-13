package com.socialv2.ewallet.utils;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.util.Log;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class NfcUtils {

    private static String TAG = NfcUtils.class.getName();

    private static boolean writeIdCardToTag(Tag tag, String json) throws Exception {
        byte[] payload = json.getBytes(StandardCharsets.UTF_8);

        // Step 1.3: Create an NDEF Record with MIME type for JSON
        NdefRecord record = NdefRecord.createMime("application/json", payload);

        // Step 1.4: Create an NDEF Message
        NdefMessage message = new NdefMessage(new NdefRecord[]{record});

        // Step 1.5: Write the NDEF Message to the tag (NTAG215 check)
        Ndef ndef = Ndef.get(tag);
        if (ndef == null) {
            throw new Exception("NDEF is not supported on this tag");
        }

        ndef.connect();
        if (ndef.getMaxSize() >= message.toByteArray().length) {
            ndef.writeNdefMessage(message);
            ndef.close();
            return true;
        }

        ndef.close();
        return false;
    }

    private static void readJsonFromTag(Tag tag) throws Exception {
        Ndef ndef = Ndef.get(tag);
        if (ndef == null) {
            throw new Exception("NDEF is not supported on this tag");
        }

        ndef.connect();
        NdefMessage ndefMessage = ndef.getNdefMessage();

        if (ndefMessage == null) {
            ndef.close();
            throw new Exception("NDEF Message is null.");
        }

        // A message contains multiple records
        for (NdefRecord record : ndefMessage.getRecords()) {
            if (record.getTnf() == NdefRecord.TNF_MIME_MEDIA
                    && Arrays.equals(record.getType(), "application/json".getBytes(StandardCharsets.US_ASCII))) {

                String jsonString = new String(record.getPayload(), StandardCharsets.UTF_8);
                Log.d(TAG, jsonString);
            }
        }

        ndef.close();
    }
}