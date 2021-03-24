package com.anam.minggu3_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Pada, Subject, Pesan;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Perintah untuk menampilkan activity linear layout
//      setContentView(R.layout.activity_linear);

        //Perintah untuk menampilkan activity Relative layout
//      setContentView(R.layout.activity_relative);

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
    }
}