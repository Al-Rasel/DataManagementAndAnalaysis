package com.example.rasel.datamanagementandanalaysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Semester extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        Bundle extra = getIntent().getExtras();
        int position = extra.getInt("Position");


        Toast.makeText(this, String.valueOf(position), Toast.LENGTH_LONG).show();


    }
}
