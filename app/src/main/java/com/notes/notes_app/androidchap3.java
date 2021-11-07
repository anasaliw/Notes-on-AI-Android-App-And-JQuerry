package com.notes.notes_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class androidchap3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidchap3);
        getSupportActionBar().hide();
        WebView web3;
        web3=findViewById(R.id.webview3);
        web3.loadUrl("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/unit-1-get-started/lesson-3-testing,-debugging,-and-using-support-libraries/3-1-c-the-android-studio-debugger/3-1-c-the-android-studio-debugger.html");
    }
}