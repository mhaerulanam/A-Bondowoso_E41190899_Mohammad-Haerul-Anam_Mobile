package com.anam.minggu3_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.midi.MidiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuDashboard extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8;
    Intent linear, relative, constrain, frame, table, materialDesign, scrollView, scrollViewHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dashboard);

        btn1 = findViewById(R.id.linear);
        btn2 = findViewById(R.id.relative);
        btn3 = findViewById(R.id.constrain);
        btn4 = findViewById(R.id.frame);
        btn5 = findViewById(R.id.table);
        btn6 = findViewById(R.id.material_design);
        btn7 = findViewById(R.id.scroll_view);
        btn8 = findViewById(R.id.scrollView_horizontal);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode untuk pindah ke aktivity linier
                linear = new Intent(MenuDashboard.this,LinearActivity.class);
                MenuDashboard.this.startActivity(linear);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
//                MenuDashboard.this.finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative = new Intent(MenuDashboard.this, RelativeActivity.class);
                startActivity(relative);
//                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constrain = new Intent(MenuDashboard.this, ConstraintActivity.class);
                startActivity(constrain);
//                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frame = new Intent(MenuDashboard.this, FrameActivity.class);
                startActivity(frame);
//                finish();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table = new Intent(MenuDashboard.this, TableActivity.class);
                startActivity(table);
//                finish();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDesign = new Intent(MenuDashboard.this, MaterialDesign.class);
                startActivity(materialDesign);
//                finish();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView = new Intent(MenuDashboard.this, ScrollView.class);
                startActivity(scrollView);
//                finish();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollViewHorizontal = new Intent(MenuDashboard.this, ScrollVIewHorizontal.class);
                startActivity(scrollViewHorizontal);
//                finish();
            }
        });




    }
}