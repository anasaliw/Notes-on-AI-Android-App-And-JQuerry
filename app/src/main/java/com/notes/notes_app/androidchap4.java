package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class androidchap4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidchap4);
        getSupportActionBar().hide();
        WebView web4;
        web4=findViewById(R.id.webview4);
        web4.loadUrl("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/unit-2-user-experience/lesson-4-user-interaction/4-1-c-buttons-and-clickable-images/4-1-c-buttons-and-clickable-images.html");
    }
}