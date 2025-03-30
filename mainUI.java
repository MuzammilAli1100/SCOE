package com.example.scoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class mainUI extends AppCompatActivity {
    WebView webView;
    public static final String webs = "com.example.scoe.webs";
    private int[] images = {R.drawable.c1, R.drawable.collegelogo, R.drawable.c2, R.drawable.teacher};
    private int currentIndex = 0;
    private ImageView imageView;
    private Handler handler = new Handler();
    private Runnable runnable;
    @SuppressLint({"MissingInflatedId", "SetJavaScriptEnabled"})

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainui);

        imageView = findViewById(R.id.imageView);

        // Start automatic image slideshow
        startImageSlideshow();
    }

    private void startImageSlideshow() {
        runnable = new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(images[currentIndex]);
                currentIndex = (currentIndex + 1) % images.length;
                handler.postDelayed(this, 3000); // Change image every 3 seconds
            }
        };
        handler.post(runnable);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable); // Stop updating images when activity is destroyed
    }
    public void result(View view)
    {
        Intent intent = new Intent(this, webview.class);

        String a = "https://engineering.saraswatikharghar.edu.in/result/";
        intent.putExtra(webs, a);
        startActivity(intent);
    }
   /* public void notice(View view)
    {
        Intent intent = new Intent(this, webview.class);

        String b = "https://engineering.saraswatikharghar.edu.in/notices/";
        intent.putExtra(webs, b);
        startActivity(intent);
    }*/

}
