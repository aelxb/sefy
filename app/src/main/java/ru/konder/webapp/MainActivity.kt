package ru.konder.webapp

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


class Web : AppCompatActivity(){
    lateinit var web : WebView
    var url = "https://sefy.ru/ "
    @SuppressLint("SetJavaScriptEnabled", "PackageManagerGetSignatures")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        web = webview1
        web.webViewClient = myWebClient()
        web.loadUrl(url)
        web.settings?.javaScriptEnabled = true
    }
    inner class myWebClient : WebViewClient(){
        override fun shouldOverrideUrlLoading(view: WebView, url:String): Boolean {
            view.loadUrl(url)
            return true
        }
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
        }
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
        }
    }
}
