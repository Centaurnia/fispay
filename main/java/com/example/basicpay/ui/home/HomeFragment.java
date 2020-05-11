package com.example.basicpay.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.basicpay.MainActivity;
import com.example.basicpay.MerListActivity;
import com.example.basicpay.R;

public class HomeFragment extends Fragment {
//    private static final int MERCH_CODE = 11;
//    private static final int QR_CODE = 12;
//    private static final int SRH_CODE = 13;
    private Button geoButton;
    private Button qrButton;
    private Button srhButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.textView);
        geoButton = root.findViewById(R.id.geoButton);
        qrButton = root.findViewById(R.id.qrButton);
        srhButton = root.findViewById(R.id.srhButton);

        geoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MerListActivity.class);
                startActivity(intent);
            }
        });
        qrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MerListActivity.class);
                startActivity(intent);
            }
        });
        srhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MerListActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }



}
