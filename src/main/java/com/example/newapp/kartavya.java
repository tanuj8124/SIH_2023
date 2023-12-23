package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class kartavya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kartavya);
        WebView webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript if required

        // Load the chatbot embed code or URL
        String chatbotEmbedCode = "<iframe\n" +
                "src=\"https://www.chatbase.co/chatbot-iframe/K89Hw1gl380833nqTq-ef\"\n" +
                "width=\"100%\"\n" +
                "style=\"height: 100%; min-height: 700px\"\n" +
                "frameborder=\"0\"\n" +
                "></iframe>\n";
        webView.loadData(chatbotEmbedCode, "text/html", "utf-8");
    }
}