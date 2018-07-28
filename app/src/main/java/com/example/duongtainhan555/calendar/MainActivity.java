package com.example.duongtainhan555.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView txtTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
        GetTime();
    }

    private void Init()
    {
        txtTime = findViewById(R.id.txtTime);
    }
    private void GetTime()
    {
        Calendar calendar = Calendar.getInstance();
        txtTime.setText(calendar.getTime() + "");
    }
}
