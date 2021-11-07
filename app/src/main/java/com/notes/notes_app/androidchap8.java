package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class androidchap8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidchap8);
        getSupportActionBar().hide();
        WebView web8;
        web8=findViewById(R.id.webview8);
        web8.loadUrl("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/unit-3-working-in-the-background/lesson-8-alarms-and-schedulers/8-2-c-alarms/8-2-c-alarms.html");
    }
}