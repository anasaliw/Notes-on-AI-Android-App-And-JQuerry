package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap7);
        getSupportActionBar().hide();
        WebView w7;
        w7=findViewById(R.id.dweb7);
        w7.loadUrl("https://www.w3schools.com/ai/ai_job_replacement.asp");
    }
}