package com.example.scoe;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview); // Ensure this is your correct XML file

        // Initialize WebView
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // Open links inside the app

        // Get Intent inside onCreate()
        Intent intent = getIntent();
        String a = intent.getStringExtra("webs"); // Use the correct key

        // Enable JavaScript (if needed)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load URL (Check for null to prevent crashes)
        if (a != null && !a.isEmpty()) {
            webView.loadUrl(a);
        } else {
            webView.loadUrl("https://engineering.saraswatikharghar.edu.in/result/"); // Default URL
        }
    }
}
