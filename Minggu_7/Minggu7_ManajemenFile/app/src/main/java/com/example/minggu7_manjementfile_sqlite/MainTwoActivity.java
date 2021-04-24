package com.example.minggu7_manjementfile_sqlite;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainTwoActivity extends AppCompatActivity {

    TextView TextTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        TextTampil = (TextView) findViewById(R.id.getText);
    }


    public void getPublic(View view) {
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS); //Nama Folder
        File myFile = new File(folder, "myData01.txt"); // Nama File
        String text = getdata(myFile);
        String tampil = text;
        if (text != null) {
            TextTampil.setText(text);
            Toast.makeText(this, "Data Public " + "'"+ tampil +"'", Toast.LENGTH_SHORT).show();
        } else {
            TextTampil.setText("No Data");
        }
    }

    public void getPrivate(View view) {
        File folder = getExternalFilesDir("Anam"); // Nama Folder
        File myFile = new File(folder, "myData02.txt"); // Nama File
        String text = getdata(myFile);
        String tampil = text;
        if (text != null) {
            TextTampil.setText(text);
            Toast.makeText(this, "Data Private " + "'"+ tampil +"'", Toast.LENGTH_SHORT).show();
        } else {
            TextTampil.setText("No Data");
        }
    }

    private String getdata(File myfile) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(myfile);
            int i = -1;
            StringBuffer buffer = new StringBuffer();
            while ((i = fileInputStream.read()) != -1) {
                buffer.append((char) i);
            }
            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public void back(View view) {
        Intent intent = new Intent(MainTwoActivity.this, MainActivity.class);
        startActivity(intent);
    }
}