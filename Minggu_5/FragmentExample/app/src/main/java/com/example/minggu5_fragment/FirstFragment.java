package com.example.minggu5_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    Button btnMessage;

    //Proses untuk menjalankan pembuatan view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    //Proses menjalankan view yang telah dibuat

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnMessage = view.findViewById(R.id.btn_toast);
        btnMessage.setOnClickListener(
                v -> Toast.makeText(getContext().getApplicationContext(), "Tampilan Fragment Pertama", Toast.LENGTH_SHORT).show());
    }
}