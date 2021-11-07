package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class androidchap7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidchap7);
        getSupportActionBar().hide();
        WebView web7;
        web7=findViewById(R.id.webview7);
        web7.loadUrl("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/unit-3-working-in-the-background/lesson-7-background-tasks/7-1-c-asynctask-and-asynctaskloader/7-1-c-asynctask-and-asynctaskloader.html");
    }
}