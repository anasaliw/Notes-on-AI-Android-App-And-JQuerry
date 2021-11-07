package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class androidchap1 extends AppCompatActivity {
    WebView web1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_androidchap1);
        web1=findViewById(R.id.webview1);
        web1.loadUrl("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/unit-1-get-started/lesson-1-build-your-first-app/1-1-c-your-first-android-app/1-1-c-your-first-android-app.html");
    }
}