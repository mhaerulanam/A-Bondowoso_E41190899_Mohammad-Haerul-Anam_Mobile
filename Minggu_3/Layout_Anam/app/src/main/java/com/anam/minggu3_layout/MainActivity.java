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

//    EditText Pada, Subject, Pesan;
//    Button Submit;

//    TextView dateTimeDisplay;
//    Calendar calendar;
//    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // Perintah untuk menampilkan activity linear layout
//      setContentView(R.layout.activity_linear);

        //Perintah untuk menampilkan activity Relative layout
        setContentView(R.layout.activity_relative);

        //Perintah untuk menampilkan activity constraint layout
//      setContentView(R.layout.activity_constraint);

        //Perintah untuk menampilkan activity layout Frame
//      setContentView(R.layout.activity_frame);

        //Perintah untuk menampilkan activity Table layout
//      setContentView(R.layout.activity_table);

        //Linear Layout
//        Pada = findViewById(R.id.pada);
//        Subject = findViewById(R.id.subject);
//        Pesan = findViewById(R.id.pesan);
//        Submit = findViewById(R.id.submit);
        // Get reference of widgets from XML layout

//        dateTimeDisplay = findViewById(R.id.text_date_display);
//
//        calendar = Calendar.getInstance();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE, MMM d, yyyy");
//        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("h:mm a");
//        date = simpleDateFormat.format(calendar.getTime());
//        String date2 = simpleDateFormat2.format(calendar.getTime());
//        dateTimeDisplay.setText(date);
//        dateTimeDisplay.setText(date2);
    }

}