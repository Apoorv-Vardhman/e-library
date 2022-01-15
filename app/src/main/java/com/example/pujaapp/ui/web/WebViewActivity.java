package com.example.pujaapp.ui.web;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pujaapp.R;
import com.example.pujaapp.utils.Constants;

public class WebViewActivity extends AppCompatActivity {
    WebView wb1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wb1=(WebView) findViewById(R.id.web_view);
        wb1.setWebViewClient(new WebViewClient());

        wb1.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wb1.getSettings().getBlockNetworkLoads();
        wb1.getSettings().setJavaScriptEnabled(true);
        wb1.loadUrl(getIntent().getStringExtra(Constants.web_url));
    }

    public void onBackPressed() {
        if (wb1.canGoBack()) {
            wb1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
