// Pat Burgess and Eoin Maloney
// SDEV 264 30D
// 1/25/2017

package com.patburgess.site_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    String url = "http://patburgess.com";
    WebView burgessWebView;

    class TestWebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        burgessWebView = (WebView) findViewById(R.id.web_view);

        burgessWebView.getSettings().setJavaScriptEnabled(true);
        burgessWebView.getSettings().setDomStorageEnabled(true);
        burgessWebView.setWebViewClient(new TestWebClient());
        burgessWebView.loadUrl(url);
    }
}
