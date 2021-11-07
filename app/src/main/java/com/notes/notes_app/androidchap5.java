package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class androidchap5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidchap5);
        getSupportActionBar().hide();
        WebView web5;
        web5=findViewById(R.id.webview5);
        web5.loadUrl("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/unit-2-user-experience/lesson-5-delightful-user-experience/5-1-c-drawables-styles-and-themes/5-1-c-drawables-styles-and-themes.html");
    }
}