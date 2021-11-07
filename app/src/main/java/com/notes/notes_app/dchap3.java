package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap3);
        getSupportActionBar().hide();
        WebView w3;
        w3=findViewById(R.id.dweb3);
        w3.loadUrl("https://www.w3schools.com/ai/ai_history_languages.asp");
    }
}