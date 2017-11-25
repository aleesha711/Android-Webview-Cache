package com.guidehumans.abc.webview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Aleesha Kanwal on 12/05/2017.
 */

public class Webview extends AppCompatActivity {

    private Context mContext;
    private WebView mWebView;
    private String mUrl="https://www.vistajet.com/news/";

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        mContext = getApplicationContext();
        mWebView = (WebView) findViewById(R.id.web_view);
        renderWebPage(mUrl);
    }

    protected void renderWebPage(String urlToRender) {
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setAppCacheEnabled(true);

        //////////////////////////////////////// Specify the app cache path
        mWebView.getSettings().setAppCachePath(mContext.getCacheDir().getPath());
        /////////////////////////////////////////////////////////////////////

        mWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        mWebView.loadUrl(urlToRender);
    }
}