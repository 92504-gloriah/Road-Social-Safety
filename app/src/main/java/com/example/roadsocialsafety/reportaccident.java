package com.example.roadsocialsafety;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class reportaccident extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportaccident);

        //create a date string.
        String date_n = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date());

        //get hold of textview.
        TextView date  = (TextView) findViewById(R.id.datetext);

        //set it as current date.
        date.setText(date_n);


        //create a date string.
        String date_t = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());

        //get hold of textview.
        TextView time  = (TextView) findViewById(R.id.time);

        //set it as current date.
        time.setText(date_t);



    }

}