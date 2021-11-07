package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap4);
        getSupportActionBar().hide();
        WebView w4;
        w4=findViewById(R.id.dweb4);
        w4.loadUrl("https://www.w3schools.com/ai/ai_history_numbers.asp");
    }
}