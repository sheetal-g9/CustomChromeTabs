package com.example.android.customchrometabs;

public class Url {
    String url;
    String name;

    public Url(String name, String url) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
