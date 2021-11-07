package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class jquerry_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquerry_course);
        //chap1
        TextView chap1;
        chap1=findViewById(R.id.j1);
        chap1.setOnClickListener(v->{
            Intent jqchap1=new Intent(getApplicationContext(),jquerry_chap1.class);
            startActivity(jqchap1);
        });
        //chap2
        TextView chap2;
        chap2=findViewById(R.id.j2);
        chap2.setOnClickListener(v->{
            Intent jqchap2=new Intent(getApplicationContext(),jquerry_chap2.class);
            startActivity(jqchap2);
        });
        //chap3
        TextView chap3;
        chap3=findViewById(R.id.j3);
        chap3.setOnClickListener(v->{
            Intent jqchap3=new Intent(getApplicationContext(),jquerry_chap3.class);
            startActivity(jqchap3);
        });
        //chap4
        TextView chap4;
        chap4=findViewById(R.id.j4);
        chap4.setOnClickListener(v->{
            Intent jqchap4=new Intent(getApplicationContext(),jquerry_chap4.class);
            startActivity(jqchap4);
        });
        //chap5
        TextView chap5;
        chap5=findViewById(R.id.j5);
        chap5.setOnClickListener(v->{
            Intent jqchap5=new Intent(getApplicationContext(),jquerry_chap5.class);
            startActivity(jqchap5);
        });
        //chap6
        TextView chap6;
        chap6=findViewById(R.id.j6);
        chap6.setOnClickListener(v->{
            Intent jqchap6=new Intent(getApplicationContext(),jquerry_chap6.class);
            startActivity(jqchap6);
        });
    }
}