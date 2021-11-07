package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class jquerry_chap5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquerry_chap5);
        getSupportActionBar().hide();
        WebView jweb5;
        jweb5=findViewById(R.id.jweb5);
        jweb5.loadUrl("https://www.w3schools.com/jquery/jquery_selectors.asp");
    }
}