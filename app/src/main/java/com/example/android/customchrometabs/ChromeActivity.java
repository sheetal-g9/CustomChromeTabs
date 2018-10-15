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
        url.add("https://www.google.com");
        url.add("https://ashoka.iitp.ac.in");
        url.add("https://172.16.1.6");

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
