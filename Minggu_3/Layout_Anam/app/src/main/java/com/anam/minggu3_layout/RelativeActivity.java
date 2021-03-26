package com.anam.minggu3_layout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RelativeActivity extends Activity {
    TextView dateTimeDisplay;
    Calendar calendar;
    String date;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        dateTimeDisplay = findViewById(R.id.text_date_display);
        calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE, MMM d, yyyy at h:mm a");
        date = simpleDateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
    }
}
