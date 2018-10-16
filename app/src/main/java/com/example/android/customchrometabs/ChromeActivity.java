package com.example.android.customchrometabs;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ChromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrome);

        Button button1 = findViewById(R.id.github_button);
        Button button2 = findViewById(R.id.webmail_button);
        Button button3 = findViewById(R.id.intranet_button);

        final List<String> url = new ArrayList<>();
//        final String url1 = "https://github.com/BVShe001";
//        final String url2 = "https://www.google.com";
        url.add("https://github.com/BVShe001");
        url.add("https://ashoka.iitp.ac.in");
        url.add("https://172.16.1.6");
        url.add("https://www.google.com");
        url.add("https://www.youtube.com");
        url.add("https://www.wikipedia.org");
        url.add("https://www.twitter.com");
        url.add("https://www.instagram.com");
        url.add("https://www.reddit.com");
        url.add("https://www.medium.com");
        url.add("https://www.netflix.com");
        url.add("https://www.twitch.tv");
        url.add("https://www.vimeo.com");
        url.add("https://www.bandcamp.com");
        url.add("https://www.yahoo.com");
        url.add("https://www.espn.com");
        url.add("https://www.cnn.com");
        url.add("https://www.nytimes.com");
        url.add("https://www.bbc.co.uk");
        url.add("https://www.theguardian.com");
        url.add("https://www.forbes.com");
        url.add("https://time.com");
        url.add("https://www.amazon.com");
        url.add("https://www.ebay.com");
        url.add("https://www.taobao.com");
        url.add("https://www.etsy.com");
        url.add("https://www.pinterest.com");
        url.add("https://www.linkedin.com");
        url.add("https://www.imdb.com");
        url.add("https://www.dropbox.com");
        url.add("https://www.imgur.com");
        url.add("https://www.flickr.com");
        url.add("https://www.ted.com");
        url.add("https://www.techcrunch.com");
        url.add("https://www.stackoverflow.com");
        url.add("https://archive.org");
        
        

        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        final CustomTabsIntent customTabsIntent = builder.build();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customTabsIntent.launchUrl(ChromeActivity.this, Uri.parse(url.get(0)));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customTabsIntent.launchUrl(ChromeActivity.this, Uri.parse(url.get(2)));

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customTabsIntent.launchUrl(ChromeActivity.this, Uri.parse(url.get(3)));

            }
        });
    }
}
