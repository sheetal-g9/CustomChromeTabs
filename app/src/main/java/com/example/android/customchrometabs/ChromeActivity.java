package com.example.android.customchrometabs;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ChromeActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
    CustomTabsIntent customTabsIntent = builder.build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrome);
        final List<Url> url = new ArrayList<>();
        url.add(new Url("https://github.com/BVShe001"));
        url.add(new Url("https://www.google.com"));
        url.add(new Url("https://ashoka.iitp.ac.in"));
        url.add(new Url("https://172.16.1.6"));
        recyclerView = findViewById(R.id.url_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CustomChromeAdapter(url));


    }
    public void onUrlClick(Url url){
        customTabsIntent.launchUrl(this,Uri.parse(url.getUrl()));
    }
}
