package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class jquerry_chap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquerry_chap2);
        getSupportActionBar().hide();
        WebView jweb2;
        jweb2=findViewById(R.id.jweb2);
        jweb2.loadUrl("https://www.w3schools.com/jquery/jquery_intro.asp");
    }
}