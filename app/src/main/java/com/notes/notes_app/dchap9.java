package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap9);
        getSupportActionBar().hide();
        WebView w9;
        w9=findViewById(R.id.dweb9);
        w9.loadUrl("https://www.w3schools.com/ai/ai_programming.asp");
    }
}