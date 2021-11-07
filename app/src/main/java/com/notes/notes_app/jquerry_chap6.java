package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class jquerry_chap6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquerry_chap6);
        getSupportActionBar().hide();
        WebView jweb6;
        jweb6=findViewById(R.id.jweb6);
        jweb6.loadUrl("https://www.w3schools.com/jquery/jquery_events.asp");
    }
}