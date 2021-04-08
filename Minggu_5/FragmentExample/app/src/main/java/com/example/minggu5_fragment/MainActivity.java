package com.example.minggu5_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnfragment1, btnfragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Proses inisialiasi object Button
        btnfragment1 = findViewById(R.id.btn_first);
        btnfragment2 = findViewById(R.id.btn_second);

        //Pemberian fungsi onClick pada object button yang baru saja dibuat
        btnfragment1.setOnClickListener( v -> loadFragmane(new FirstFragment()));
        btnfragment2.setOnClickListener( v -> loadFragmane(new SecondFragment()));

    }

    private <Fragment> void loadFragmane(androidx.fragment.app.Fragment Fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //tahap pengecekan fragment yang direplace apakah mempunyai isi
        if (Fragment != null) {
            transaction.replace(R.id.frameLayout, Fragment);
            transaction.commit();
        }
    }


}