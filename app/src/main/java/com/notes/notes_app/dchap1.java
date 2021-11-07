package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class dchap1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dchap1);
        getSupportActionBar().hide();
    WebView w1;
    w1=findViewById(R.id.dweb1);
    w1.loadUrl("https://www.w3schools.com/ai/ai_whatis.asp");
    //w1.loadUrl("https://learn.saylor.org/course/view.php?id=67&sectionid=15589");


    }
}