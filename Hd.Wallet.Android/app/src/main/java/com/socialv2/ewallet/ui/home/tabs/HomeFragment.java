package com.socialv2.ewallet.ui.home.tabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.socialv2.ewallet.BaseFragment;
import com.socialv2.ewallet.R;
import com.socialv2.ewallet.ui.home.DepositMoneyActivity;
import com.socialv2.ewallet.ui.home.TransferMoneyActivity;
import com.socialv2.ewallet.ui.register.WelcomeActivity;
import com.socialv2.ewallet.utils.NavigateUtil;

public class HomeFragment extends BaseFragment {

    private CardView cardviewDeposit;
    private CardView mCardviewTransfer;
    private CardView cardviewScanQr;
    private CardView cardviewHistory;


    private ImageButton mButtonNotification;

    public HomeFragment() {
        super(R.layout.fragment_home);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Ánh xạ các CardView
        cardviewDeposit = view.findViewById(R.id.cardviewDeposit);
        mCardviewTransfer = view.findViewById(R.id.cardviewTransfer);
        cardviewScanQr = view.findViewById(R.id.cardviewScanQr);
//        cardviewHistory = view.findViewById(R.id.cardviewHistory);

//        cardviewDeposit.setOnClickListener(v -> {
//            NavigateUtil.navigateTo(this, DepositMoneyActivity.class);
//        });
//
//        mCardviewTransfer.setOnClickListener(v -> {
//            NavigateUtil.navigateTo(this, TransferMoneyActivity.class);
//        });

        cardviewScanQr.setOnClickListener(v -> {
            // Thực hiện hành động khi cardviewScanQr được nhấn
        });

        cardviewHistory.setOnClickListener(v -> {
            // Thực hiện hành động khi cardviewHistory được nhấn
        });
    }
}
