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
            
            //news
            url.add("https://www.wired.com");
            url.add("https://www.digg.com");
            url.add("https://www.gizmodo.com");
            url.add("https://www.espn.com");
            url.add("https://www.sports.yahoo.com");
            url.add("https://www.cbssports.com");
            url.add("https://www.cnn.com");
            url.add("https://www.nytimes.com");
            url.add("https://www.bbc.co.uk");
            url.add("https://www.theguardian.com");
            url.add("https://www.forbes.com");
            url.add("https://www.telegraph.co.uk");
            url.add("https://www.businessinsider.com");
            url.add("https://www.washingtonpost.com");
            url.add("https://www.latimes.com");
            url.add("https://www.indiatimes.com");
            url.add("https://www.chinadaily.com.cn");
            url.add("https://time.com");
            url.add("https://www.weather.com");
            url.add("https://www.foxnews.com");
            url.add("https://www.nbcnews.com/");
            url.add("https://www.usatoday.com");
            url.add("https://www.reuters.com");
            url.add("https://www.techcrunch.com");
            url.add("https://www.ign.com");
            url.add("https://www.cnet.com");
            url.add("https://www.toutiao.com");
            url.add("https://news.ycombinator.com");

            //google sites
            url.add("https://www.google.com");
            url.add("https://www.google.com/gmail");
            url.add("https://www.news.google.com");
            url.add("https://maps.google.com");
            url.add("https://pay.google.com/about");
            url.add("https://drive.google.com");
            url.add("https://calendar.google.com");
            url.add("https://opensource.google.com");


            //social media/blogging/forum
            url.add("https://www.twitter.com");
            url.add("https://www.instagram.com");
            url.add("https://www.reddit.com");
            url.add("https://www.medium.com");
            url.add("https://www.tumblr.com");
            url.add("https://www.yelp.com");
            url.add("https://www.9gag.com");
            url.add("https://www.pinterest.com");
            url.add("https://www.facebook.com");
            url.add("https://www.imgur.com");
            url.add("https://www.kotaku.com");
            url.add("https://www.patreon.com");
            url.add("https://www.buzzfeed.com");
            url.add("https://www.stackoverflow.com");
            url.add("https://stackexchange.com/");
            url.add("https://www.flickr.com");
            url.add("https://www.weibo.com");
            url.add("https://www.douban.com");

            //audio/video/movie
            url.add("https://www.netflix.com");
            url.add("https://www.twitch.tv");
            url.add("https://www.vimeo.com");
            url.add("https://www.youtube.com");
            url.add("https://www.bandcamp.com");
            url.add("https://www.youku.com");
            url.add("https://www.pandora.com");
            url.add("https://www.soundcload.com");
            url.add("https://www.last.fm");
            url.add("https://www.hulu.com");
            url.add("https://www.npr.org");
            url.add("https://www.scribd.com");
            url.add("https://www.audible.com/");
            url.add("https://www.imdb.com");
            url.add("https://www.rottentomatoes.com");

            //utilities (search engines, code sharing, messaging, etc.)
            url.add("https://github.com/BVShe001");
            url.add("https://172.16.1.6");
            url.add("https://www.live.com");
            url.add("https://www.naver.com");
            url.add("https://www.yahoo.com");
            url.add("https://www.whatsapp.com");
            url.add("https://www.msn.com");
            url.add("https://duckduckgo.com");
            url.add("https://www.paypal.com");
            url.add("https://www.office.com");
            url.add("https://bitbucket.org");
            url.add("https://www.bit.ly");
            url.add("https://www.sourceforge.net");
            url.add("https://slack.com");
            url.add("https://www.dropbox.com");
            url.add("https://www.digitalocean.com");

            //professional/job
            url.add("https://www.indeed.com");
            url.add("https://www.monster.com");
            url.add("https://www.linkedin.com");
            url.add("https://www.glassdoor.com/index.htm");
            url.add("https://www.roberthalf.com");
            url.add("https://www.careerbuilder.com");
            url.add("https://www.simplyhired.com");

            //shopping
            url.add("https://www.amazon.com");
            url.add("https://www.ebay.com");
            url.add("https://www.aliexpress.com");
            url.add("https://www.taobao.com");
            url.add("https://www.etsy.com");
            url.add("https://www.rakuten.co.jp");
            url.add("https://www.gmarket.co.kr");

            //academic/educational/
            url.add("https://ashoka.iitp.ac.in");      
            url.add("https://www.wikipedia.org");        
            url.add("https://www.wikihow.com");
            url.add("https://www.webmd.com");
            url.add("https://www.grammarly.com");        
            url.add("https://www.ted.com");
            url.add("https://archive.org");
            url.add("https://www.khanacademy.org");
            url.add("https://learncodeonline.in");
            url.add("https://www.freecodecamp.org");
            url.add("https://nptel.ac.in");
            url.add("https://swayam.gov.in");
            url.add("https://www.edx.org");
            url.add("https://dev.to");

            //food/recipe        
            url.add("https://www.allrecipes.com");
            url.add("https://www.foodnetwork.com");
            url.add("https://www.yummly.com");
            url.add("https://www.chowhound.com");
            url.add("https://www.zomato.com");
            url.add("https://www.uber.com");
            url.add("https://www.swiggy.com");

	//programming
	        url.add("https://www.codecademy.com");
	        url.add("https://www.udemy.com");
	        url.add("https://www.edx.org");
			url.add("https://www.codewars.com");
			url.add("https://www.coursera.org");
			url.add("https://www.freecodecamp.org");
			url.add("https://www.udacity.com");
			url.add("https://ocw.mit.edu/index.htm");
			url.add("https://www.khanacademy.org/");
			url.add("https://www.theodinproject.com");
            url.add("https://raywenderlich.com");
            url.add("https://pluralsight.com");



			      

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
