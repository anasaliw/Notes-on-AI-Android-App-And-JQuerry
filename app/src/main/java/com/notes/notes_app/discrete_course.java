package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class discrete_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discrete_course);
        //chap1
        TextView d1;
        d1=findViewById(R.id.d1);
        d1.setOnClickListener(v->{
            Intent chap1=new Intent(getApplicationContext(),dchap1.class);
            startActivity(chap1);
        });
        //chap2
        TextView d2;
        d2=findViewById(R.id.d2);
        d2.setOnClickListener(v->{
            Intent chap2=new Intent(getApplicationContext(),dchap2.class);
            startActivity(chap2);
        });
        //chap3
        TextView d3;
        d3=findViewById(R.id.d3);
        d3.setOnClickListener(v->{
            Intent chap3=new Intent(getApplicationContext(),dchap3.class);
            startActivity(chap3);
        });
        //chap4
        TextView d4;
        d4=findViewById(R.id.d4);
        d4.setOnClickListener(v->{
            Intent chap4=new Intent(getApplicationContext(),dchap4.class);
            startActivity(chap4);
        });
        //chap5
        TextView d5;
        d5=findViewById(R.id.d5);
        d5.setOnClickListener(v->{
            Intent chap5=new Intent(getApplicationContext(),dchap5.class);
            startActivity(chap5);
        });
        //chap6
        TextView d6;
        d6=findViewById(R.id.d6);
        d6.setOnClickListener(v->{
            Intent chap6=new Intent(getApplicationContext(),dchap6.class);
            startActivity(chap6);
        });
        //chap7
        TextView d7;
        d7=findViewById(R.id.d7);
        d7.setOnClickListener(v->{
            Intent chap7=new Intent(getApplicationContext(),dchap7.class);
            startActivity(chap7);
        });
        //chap8
        TextView d8;
        d8=findViewById(R.id.d8);
        d8.setOnClickListener(v->{
            Intent chap8=new Intent(getApplicationContext(),dchap8.class);
            startActivity(chap8);
        });
        //chap9
        TextView d9;
        d9=findViewById(R.id.d9);
        d9.setOnClickListener(v->{
            Intent chap9=new Intent(getApplicationContext(),dchap9.class);
            startActivity(chap9);
        });
    }
}