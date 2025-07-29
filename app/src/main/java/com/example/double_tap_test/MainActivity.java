package com.example.double_tap_test;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);

        // Make WebView accessible
        webView.setImportantForAccessibility(View.IMPORTANT_FOR_ACCESSIBILITY_YES);

        // Zoom settings: disable all zoom features for accessibility
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);                // Disable zoom support
        webSettings.setBuiltInZoomControls(false);        // Don't show zoom controls
        webSettings.setDisplayZoomControls(false);        // Hide zoom UI
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);

        setContentView(webView);

        // Load your local test file
        webView.loadUrl("file:///android_asset/test.html");
    }
}
