package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap8);
        getSupportActionBar().hide();
        WebView w8;
        w8=findViewById(R.id.dweb8);
        w8.loadUrl("https://www.w3schools.com/ai/ai_examples.asp");
    }
}