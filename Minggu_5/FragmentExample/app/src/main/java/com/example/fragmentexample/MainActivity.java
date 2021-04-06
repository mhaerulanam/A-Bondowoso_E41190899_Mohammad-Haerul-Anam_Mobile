package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        get the reference of button's'
        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);

//        permorm setOnclickListener event on First Button
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load First fragment
                loadFragment(new FirstFragment());
            }
        });

//        permorm setOnclickListener event on Second Button
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load Second fragment
                loadFragment(new SecondFragment());
            }
        });
    }
    protected void loadFragment(Fragment fragment) {
//        create a FragmentManager
//        FragmentManager fm = getFragmentManager();
        //create a FragmentTransaction to begin the transaction and replace the Fragment
//        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //replace the FrameLayout with new Fragment
//        fragmentTransaction.replace(R.id.frameLayout, fragment);
//        fragmentTransaction.commit(); //save the change


        androidx.fragment.app.FragmentTransaction fm2 = getSupportFragmentManager().beginTransaction();
        androidx.fragment.app.FragmentTransaction t = null;
        t.replace(R.id.frameLayout, fragment);
        t.commit();


    }
}