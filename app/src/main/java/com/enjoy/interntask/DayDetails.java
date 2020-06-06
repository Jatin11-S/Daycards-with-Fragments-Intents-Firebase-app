package com.enjoy.interntask;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DayDetails extends AppCompatActivity {
    //ImageView img;
    TextView day;
    String d;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //img = findViewById(R.id.imageView);
        day = (TextView) findViewById(R.id.textView2);
        d = getIntent().getExtras().get("day").toString();
        //day.setText(d);
    }
}
