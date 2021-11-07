package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class jquerry_chap3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquerry_chap3);
        getSupportActionBar().hide();
        WebView jweb3;
        jweb3=findViewById(R.id.jweb3);
        jweb3.loadUrl("https://www.w3schools.com/jquery/jquery_get_started.asp");
    }
}