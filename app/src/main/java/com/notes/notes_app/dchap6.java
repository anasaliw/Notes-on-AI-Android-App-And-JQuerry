package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap6);
        getSupportActionBar().hide();
        WebView w6;
        w6=findViewById(R.id.dweb6);
        w6.loadUrl("https://www.w3schools.com/ai/ai_robots.asp");
    }
}