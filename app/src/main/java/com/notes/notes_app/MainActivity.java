package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView androidapp;
    TextView AI;
    TextView jquerry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidapp=findViewById(R.id.chap1);
        androidapp.setOnClickListener(v -> {
            Intent androidapp=new Intent(getApplicationContext(),android_course.class);
            startActivity(androidapp);
        });
        //AI course link
        AI=findViewById(R.id.subject2);
        AI.setOnClickListener(v->{
            Intent AI=new Intent(getApplicationContext(),discrete_course.class);
            startActivity(AI);
        });
        //JQuerry Course Link
        jquerry=findViewById(R.id.subject3);
        jquerry.setOnClickListener(v->{
            Intent jquerry=new Intent(getApplicationContext(),jquerry_course.class);
            startActivity(jquerry);
        });
    }
}