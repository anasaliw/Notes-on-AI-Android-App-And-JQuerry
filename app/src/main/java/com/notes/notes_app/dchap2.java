package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap2);
        getSupportActionBar().hide();
        WebView w2;
        w2=findViewById(R.id.dweb2);
        w2.loadUrl("https://www.w3schools.com/ai/ai_history_brain.asp");
    }
}