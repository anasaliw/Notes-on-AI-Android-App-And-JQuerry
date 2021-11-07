package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class jquerry_chap1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquerry_chap1);
        getSupportActionBar().hide();
        WebView jweb1;
        jweb1=findViewById(R.id.jweb1);
        jweb1.loadUrl("https://www.w3schools.com/jquery/default.asp");
    }
}