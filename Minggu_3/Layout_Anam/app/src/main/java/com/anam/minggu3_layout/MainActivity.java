package com.anam.minggu3_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.text.Selection;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Perintah untuk menampilkan activity linear layout
//      setContentView(R.layout.activity_linear);

        //Perintah untuk menampilkan activity Relative layout
//        setContentView(R.layout.activity_relative);

        //Perintah untuk menampilkan activity constraint layout
//      setContentView(R.layout.activity_constraint);

        //Perintah untuk menampilkan activity layout Frame
//      setContentView(R.layout.activity_frame);

        //Perintah untuk menampilkan activity Table layout
//      setContentView(R.layout.activity_table);

        //Perintah untuk menampilkan activity Material Design layout
//      setContentView(R.layout.activity_material_design);

        //Perintah untuk menampilkan activity Scroll View layout
//      setContentView(R.layout.activity_scroll_view);

        //Perintah untuk menampilkan activity Scroll View Horizontal layout
//      setContentView(R.layout.activity_scroll_v_iew_horizontal);

        //Perintah untuk menampilkan activity Menu Dashboard layout
      setContentView(R.layout.activity_menu_dashboard);
    }

}