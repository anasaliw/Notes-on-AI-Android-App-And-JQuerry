package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class androidchap6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidchap6);
        getSupportActionBar().hide();
        WebView web6;
        web6=findViewById(R.id.webview6);
        web6.loadUrl("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/unit-2-user-experience/lesson-6-testing-your-ui/6-1-c-ui-testing/6-1-c-ui-testing.html");
    }
}