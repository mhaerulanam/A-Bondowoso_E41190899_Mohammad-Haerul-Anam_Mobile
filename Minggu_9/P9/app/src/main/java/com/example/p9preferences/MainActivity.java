package com.example.p9preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    EditText editTextInput;
    Button buttonSimpan;
    TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = findViewById(R.id.Edtxt);
        buttonSimpan = findViewById(R.id.btn);
        textViewOutput = findViewById(R.id.txtview);

        sharedPref = getSharedPreferences("Belajar_SharePreferences", Context.MODE_PRIVATE);

        if (sharedPref.contains("key_data")){
            textViewOutput.setText(sharedPref.getString("key_data", null));
        }

        buttonSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDAta();
                Toast.makeText(getApplicationContext(), "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show();            }
        });
    }

    private void getDAta() {
        String data = editTextInput.getText().toString();
        editor = sharedPref.edit();
        editor.putString("key_data", data);
        editor.apply();
        textViewOutput.setText(sharedPref.getString("key_data", null));

    }
}