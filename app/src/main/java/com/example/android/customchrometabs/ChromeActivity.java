package com.example.android.customchrometabs;

import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        final CustomTabsIntent customTabsIntent = builder.build();

        final List<Url> url = new ArrayList<>();
        url.add(new Url("https://github.com/BVShe001"));
        url.add(new Url("https://www.google.com"));
        url.add(new Url("https://ashoka.iitp.ac.in"));
        url.add(new Url("https://172.16.1.6"));
        recyclerView = findViewById(R.id.url_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CustomChromeAdapter(url));

        //news
        url.add(new Url("https://www.wired.com"));
        url.add(new Url("https://www.digg.com"));
        url.add(new Url("https://www.gizmodo.com"));
        url.add(new Url("https://www.espn.com"));
        url.add(new Url("https://www.sports.yahoo.com"));
        url.add(new Url("https://www.cbssports.com"));
        url.add(new Url("https://www.cnn.com"));
        url.add(new Url("https://www.nytimes.com"));
        url.add(new Url("https://www.bbc.co.uk"));
        url.add(new Url("https://www.theguardian.com"));
        url.add(new Url("https://www.forbes.com"));
        url.add(new Url("https://www.telegraph.co.uk"));
        url.add(new Url("https://www.businessinsider.com"));
        url.add(new Url("https://www.washingtonpost.com"));
        url.add(new Url("https://www.latimes.com"));
        url.add(new Url("https://www.indiatimes.com"));
        url.add(new Url("https://www.chinadaily.com.cn"));
        url.add(new Url("https://time.com"));
        url.add(new Url("https://www.weather.com"));
        url.add(new Url("https://www.foxnews.com"));
        url.add(new Url("https://www.nbcnews.com/"));
        url.add(new Url("https://www.usatoday.com"));
        url.add(new Url("https://www.reuters.com"));
        url.add(new Url("https://www.techcrunch.com"));
        url.add(new Url("https://www.ign.com"));
        url.add(new Url("https://www.cnet.com"));
        url.add(new Url("https://www.toutiao.com"));
        url.add(new Url("https://news.ycombinator.com"));

        //google sites
        url.add(new Url("https://www.google.com"));
        url.add(new Url("https://www.google.com/gmail"));
        url.add(new Url("https://www.news.google.com"));
        url.add(new Url("https://maps.google.com"));
        url.add(new Url("https://pay.google.com/about"));
        url.add(new Url("https://drive.google.com"));
        url.add(new Url("https://calendar.google.com"));
        url.add(new Url("https://opensource.google.com"));

        url.add(new Url("https://fonts.google.com"));
        url.add(new Url("https://translate.google.com"));
        url.add(new Url("https://duo.google.com"));
        url.add(new Url("https://photos.google.com"));

        //social media/blogging/forum
        url.add(new Url("https://www.twitter.com"));
        url.add(new Url("https://www.instagram.com"));
        url.add(new Url("https://www.reddit.com"));
        url.add(new Url("https://www.medium.com"));
        url.add(new Url("https://www.tumblr.com"));
        url.add(new Url("https://www.yelp.com"));
        url.add(new Url("https://www.9gag.com"));
        url.add(new Url("https://www.pinterest.com"));
        url.add(new Url("https://www.facebook.com"));
        url.add(new Url("https://www.imgur.com"));
        url.add(new Url("https://www.kotaku.com"));
        url.add(new Url("https://www.patreon.com"));
        url.add(new Url("https://www.buzzfeed.com"));
        url.add(new Url("https://www.stackoverflow.com"));
        url.add(new Url("https://stackexchange.com/"));
        url.add(new Url("https://www.flickr.com"));
        url.add(new Url("https://www.weibo.com"));
        url.add(new Url("https://www.douban.com"));

        //audio/video/movie
        url.add(new Url("https://www.netflix.com"));
        url.add(new Url("https://www.twitch.tv"));
        url.add(new Url("https://www.vimeo.com"));
        url.add(new Url("https://www.youtube.com"));
        url.add(new Url("https://www.bandcamp.com"));
        url.add(new Url("https://www.youku.com"));
        url.add(new Url("https://www.pandora.com"));
        url.add(new Url("https://www.soundcload.com"));
        url.add(new Url("https://www.last.fm"));
        url.add(new Url("https://www.hulu.com"));
        url.add(new Url("https://www.npr.org"));
        url.add(new Url("https://www.scribd.com"));
        url.add(new Url("https://www.audible.com/"));
        url.add(new Url("https://www.imdb.com"));
        url.add(new Url("https://www.rottentomatoes.com"));

        //utilities (search engines, code sharing, messaging, etc.)
        url.add(new Url("https://github.com/BVShe001"));
        url.add(new Url("https://172.16.1.6"));
        url.add(new Url("https://www.live.com"));
        url.add(new Url("https://www.naver.com"));
        url.add(new Url("https://www.yahoo.com"));
        url.add(new Url("https://www.whatsapp.com"));
        url.add(new Url("https://www.msn.com"));
        url.add(new Url("https://duckduckgo.com"));
        url.add(new Url("https://www.paypal.com"));
        url.add(new Url("https://www.office.com"));
        url.add(new Url("https://bitbucket.org"));
        url.add(new Url("https://www.bit.ly"));
        url.add(new Url("https://www.sourceforge.net"));
        url.add(new Url("https://slack.com"));
        url.add(new Url("https://www.dropbox.com"));
        url.add(new Url("https://www.digitalocean.com"));

        //professional/job
        url.add(new Url("https://www.indeed.com"));
        url.add(new Url("https://www.monster.com"));
        url.add(new Url("https://www.linkedin.com"));
        url.add(new Url("https://www.glassdoor.com/index.htm"));
        url.add(new Url("https://www.roberthalf.com"));
        url.add(new Url("https://www.careerbuilder.com"));
        url.add(new Url("https://www.simplyhired.com"));
        url.add(new Url("https://angel.co/"));

        //shopping
        url.add(new Url("https://www.amazon.com"));
        url.add(new Url("https://www.ebay.com"));
        url.add(new Url("https://www.aliexpress.com"));
        url.add(new Url("https://www.taobao.com"));
        url.add(new Url("https://www.etsy.com"));
        url.add(new Url("https://www.rakuten.co.jp"));
        url.add(new Url("https://www.gmarket.co.kr"));

        //academic/educational/
        url.add(new Url("https://ashoka.iitp.ac.in"));
        url.add(new Url("https://www.wikipedia.org"));
        url.add(new Url("https://www.wikihow.com"));
        url.add(new Url("https://www.webmd.com"));
        url.add(new Url("https://www.grammarly.com"));
        url.add(new Url("https://www.ted.com"));
        url.add(new Url("https://archive.org"));
        url.add(new Url("https://www.khanacademy.org"));
        url.add(new Url("https://learncodeonline.in"));
        url.add(new Url("https://www.freecodecamp.org"));
        url.add(new Url("https://nptel.ac.in"));
        url.add(new Url("https://swayam.gov.in"));
        url.add(new Url("https://www.edx.org"));
        url.add(new Url("https://dev.to"));

        //food/recipe
        url.add(new Url("https://www.allrecipes.com"));
        url.add(new Url("https://www.foodnetwork.com"));
        url.add(new Url("https://www.yummly.com"));
        url.add(new Url("https://www.chowhound.com"));
        url.add(new Url("https://www.zomato.com"));
        url.add(new Url("https://www.uber.com"));
        url.add(new Url("https://www.swiggy.com"));

        //programming

        url.add(new Url("https://raywenderlich.com"));
        url.add(new Url("https://pluralsight.com"));


        url.add(new Url("https://www.codecademy.com"));
        url.add(new Url("https://www.udemy.com"));
        url.add(new Url("https://www.edx.org"));
        url.add(new Url("https://www.codewars.com"));
        url.add(new Url("https://www.coursera.org"));
        url.add(new Url("https://www.freecodecamp.org"));
        url.add(new Url("https://www.udacity.com"));
        url.add(new Url("https://ocw.mit.edu/index.htm"));
        url.add(new Url("https://www.khanacademy.org/"));
        url.add(new Url("https://www.theodinproject.com"));

        url.add(new Url("https://www.makemytrip.com"));
        url.add(new Url("https://www.easemytrip.com"));
        url.add(new Url("https://www.goibibo.com"));
        url.add(new Url("https://www.expedia.co.in"));
        url.add(new Url("https://www.cleartrip.com"));
        url.add(new Url("https://www.yatra.com"));
        url.add(new Url("https://paytm.com"));
        url.add(new Url("https://www.redbus.in"));
        url.add(new Url("https://www.trivago.in"));
        url.add(new Url("https://www.oyorooms.com"));
    }

    public void onUrlClick(Url url) {
        customTabsIntent.launchUrl(this, Uri.parse(url.getUrl()));
    }
}
