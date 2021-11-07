package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class android_course extends AppCompatActivity {
    TextView chap1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_course);
    chap1=findViewById(R.id.chapter1);
        chap1.setOnClickListener(v -> {
            Intent chap1=new Intent(getApplicationContext(),androidchap1.class);
            startActivity(chap1);
        });
        //chaper2
        TextView chap2;
        chap2 = findViewById(R.id.chapter2);
        chap2.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(), androidchap2.class);
            startActivity(intent2);
        });
        //chaper3
        TextView chap3;
        chap3 = findViewById(R.id.chapter3);
        chap3.setOnClickListener(v -> {
            Intent intent3 = new Intent(getApplicationContext(), androidchap3.class);
            startActivity(intent3);
        });
        //chaper4
        TextView chap4;
        chap4 = findViewById(R.id.chapter4);
        chap4.setOnClickListener(v -> {
            Intent intent4 = new Intent(getApplicationContext(), androidchap4.class);
            startActivity(intent4);
        });
        //chaper5
        TextView chap5;
        chap5 = findViewById(R.id.chapter5);
        chap5.setOnClickListener(v -> {
            Intent intent5 = new Intent(getApplicationContext(), androidchap5.class);
            startActivity(intent5);
        });
        //chaper6
        TextView chap6;
        chap6 = findViewById(R.id.chapter6);
        chap6.setOnClickListener(v -> {
            Intent intent6 = new Intent(getApplicationContext(), androidchap6.class);
            startActivity(intent6);
        });
        //chaper7
        TextView chap7;
        chap7 = findViewById(R.id.chapter7);
        chap7.setOnClickListener(v -> {
            Intent intent7 = new Intent(getApplicationContext(), androidchap7.class);
            startActivity(intent7);
        });
        //chaper8
        TextView chap8;
        chap8 = findViewById(R.id.chapter8);
        chap8.setOnClickListener(v -> {
            Intent intent8 = new Intent(getApplicationContext(), androidchap8.class);
            startActivity(intent8);
        });
        //chaper9
        TextView chap9;
        chap9 = findViewById(R.id.chapter9);
        chap9.setOnClickListener(v -> {
            Intent intent9 = new Intent(getApplicationContext(), androidchap9.class);
            startActivity(intent9);
        });
        //chaper10
        TextView chap10;
        chap10 = findViewById(R.id.chapter10);
        chap10.setOnClickListener(v -> {
            Intent intent10 = new Intent(getApplicationContext(), androidchap10.class);
            startActivity(intent10);
        });

    }
}