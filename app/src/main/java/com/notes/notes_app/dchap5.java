package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap5);
        getSupportActionBar().hide();
        WebView w5;
        w5=findViewById(R.id.dweb5);
        w5.loadUrl("https://www.w3schools.com/ai/ai_history_computers.asp");
    }
}