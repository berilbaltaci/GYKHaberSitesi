package com.example.gykhabersitesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HaberSitesiActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haber_sitesi);

        webView = (WebView) findViewById(R.id.webView);

        Intent intent = getIntent();
        String x = intent.getStringExtra("link");

        webView.loadUrl(x);
        webView.getSettings().setJavaScriptEnabled(true);

    }
}
