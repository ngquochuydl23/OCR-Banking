package com.socialv2.ewallet.sharedReferences;

import android.content.Context;


import com.socialv2.ewallet.BaseSharedPreferences;

public class SaveTokenSharedPreference extends BaseSharedPreferences<String> {

    private static final String KeyName = "accessToken";

    public SaveTokenSharedPreference(Context context) {
        super(context, KeyName, String.class);
    }
}