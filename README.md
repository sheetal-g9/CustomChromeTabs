# Custom Chrome Tabs

## Introduction

> An Android Application to browse links in Chrome tabs in the app.

> To do so we use the Custom Tabs package provides APIs to support adding and managing custom tabs in your apps.

>The Custom Tabs Support library adds support for various classes, such as Custom Tabs Service and Custom Tabs Callback.

> Chrome Custom Tabs allow an app to customize how Chrome looks and feels. An app can change things like:

> * Toolbar color
> * Enter and exit animations
> * Add custom actions to the Chrome toolbar, overflow menu and bottom toolbar

![alt text](https://developer.chrome.com/multidevice/images/customtab/performance.gif)

## Code Samples

        final List<String> url = new ArrayList<>();
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


## Installation

> This package requires API level 15 or higher. The Gradle build script dependency identifier for this library is as follows:

     com.android.support:customtabs:28.0.0
# CustomChromeTabs
An Android App to use Custom Chrome Tabs
