package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class jquerry_chap4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquerry_chap4);
        getSupportActionBar().hide();
        WebView jweb4;
        jweb4=findViewById(R.id.jweb4);
        jweb4.loadUrl("https://www.w3schools.com/jquery/jquery_syntax.asp");
    }
}