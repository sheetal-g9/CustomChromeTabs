package com.example.android.customchrometabs;

import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ChromeActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;

    CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
    CustomTabsIntent customTabsIntent = builder.build();

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id)
        {
            case R.id.action_:Toast.makeText(this,"clicked", Toast.LENGTH_SHORT).show();
                                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrome);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        final CustomTabsIntent customTabsIntent = builder.build();

        final List<Url> url = new ArrayList<>();
        recyclerView = findViewById(R.id.url_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CustomChromeAdapter(url));
        url.add(new Url("Github","https://github.com/BVShe001"));
        url.add(new Url("Google","https://www.google.com"));
        url.add(new Url("Mail@IITP","https://mail.iitp.ac.in"));
        url.add(new Url("Intranet","https://172.16.1.6"));

        //news
        url.add(new Url("Wired","https://www.wired.com"));
        url.add(new Url("Digg","https://www.digg.com"));
        url.add(new Url("Gizmodo","https://www.gizmodo.com"));
        url.add(new Url("ESPN","https://www.espn.com"));
        url.add(new Url("Sports Yahoo","https://www.sports.yahoo.com"));
        url.add(new Url("CBSSports","https://www.cbssports.com"));
        url.add(new Url("CNN","https://www.cnn.com"));
        url.add(new Url("NYTimes","https://www.nytimes.com"));
        url.add(new Url("Website","https://www.bbc.co.uk"));
        url.add(new Url("The Guardian","https://www.theguardian.com"));
        url.add(new Url("Forbes","https://www.forbes.com"));
        url.add(new Url("Telegraph","https://www.telegraph.co.uk"));
        url.add(new Url("Business Insider","https://www.businessinsider.com"));
        url.add(new Url("Washington Post","https://www.washingtonpost.com"));
        url.add(new Url("Latimes","https://www.latimes.com"));
        url.add(new Url("India Times","https://www.indiatimes.com"));
        url.add(new Url("China Daily","https://www.chinadaily.com.cn"));
        url.add(new Url("Time","https://time.com"));
        url.add(new Url("Website","https://www.weather.com"));
        url.add(new Url("Website","https://www.foxnews.com"));
        url.add(new Url("Website","https://www.nbcnews.com/"));
        url.add(new Url("Website","https://www.usatoday.com"));
        url.add(new Url("Website","https://www.reuters.com"));
        url.add(new Url("Website","https://www.techcrunch.com"));
        url.add(new Url("Website","https://www.ign.com"));
        url.add(new Url("Website","https://www.cnet.com"));
        url.add(new Url("Website","https://www.toutiao.com"));
        url.add(new Url("Website","https://news.ycombinator.com"));

        //google sites
        url.add(new Url("Website","https://www.google.com"));
        url.add(new Url("Website","https://www.google.com/gmail"));
        url.add(new Url("Website","https://www.news.google.com"));
        url.add(new Url("Website","https://maps.google.com"));
        url.add(new Url("Website","https://pay.google.com/about"));
        url.add(new Url("Website","https://drive.google.com"));
        url.add(new Url("Website","https://calendar.google.com"));
        url.add(new Url("Website","https://opensource.google.com"));

        url.add(new Url("Website","https://fonts.google.com"));
        url.add(new Url("Website","https://translate.google.com"));
        url.add(new Url("Website","https://duo.google.com"));
        url.add(new Url("Website","https://photos.google.com"));

        //social media/blogging/forum
        url.add(new Url("Website","https://www.twitter.com"));
        url.add(new Url("Website","https://www.instagram.com"));
        url.add(new Url("Website","https://www.reddit.com"));
        url.add(new Url("Website","https://www.medium.com"));
        url.add(new Url("Website","https://www.tumblr.com"));
        url.add(new Url("Website","https://www.yelp.com"));
        url.add(new Url("Website","https://www.9gag.com"));
        url.add(new Url("Website","https://www.pinterest.com"));
        url.add(new Url("Website","https://www.facebook.com"));
        url.add(new Url("Website","https://www.imgur.com"));
        url.add(new Url("Website","https://www.kotaku.com"));
        url.add(new Url("Website","https://www.patreon.com"));
        url.add(new Url("Website","https://www.buzzfeed.com"));
        url.add(new Url("Website","https://www.stackoverflow.com"));
        url.add(new Url("Website","https://stackexchange.com/"));
        url.add(new Url("Website","https://www.flickr.com"));
        url.add(new Url("Website","https://www.weibo.com"));
        url.add(new Url("Website","https://www.douban.com"));

        //audio/video/movie
        url.add(new Url("Website","https://www.netflix.com"));
        url.add(new Url("Website","https://www.twitch.tv"));
        url.add(new Url("Website","https://www.vimeo.com"));
        url.add(new Url("Website","https://www.youtube.com"));
        url.add(new Url("Website","https://www.bandcamp.com"));
        url.add(new Url("Website","https://www.youku.com"));
        url.add(new Url("Website","https://www.pandora.com"));
        url.add(new Url("Website","https://www.soundcload.com"));
        url.add(new Url("Website","https://www.last.fm"));
        url.add(new Url("Website","https://www.hulu.com"));
        url.add(new Url("Website","https://www.npr.org"));
        url.add(new Url("Website","https://www.scribd.com"));
        url.add(new Url("Website","https://www.audible.com/"));
        url.add(new Url("Website","https://www.imdb.com"));
        url.add(new Url("Website","https://www.rottentomatoes.com"));

        //utilities (search engines, code sharing, messaging, etc.)
        url.add(new Url("Website","https://github.com/BVShe001"));
        url.add(new Url("Website","https://172.16.1.6"));
        url.add(new Url("Website","https://www.live.com"));
        url.add(new Url("Website","https://www.naver.com"));
        url.add(new Url("Website","https://www.yahoo.com"));
        url.add(new Url("Website","https://www.whatsapp.com"));
        url.add(new Url("Website","https://www.msn.com"));
        url.add(new Url("Website","https://duckduckgo.com"));
        url.add(new Url("Website","https://www.paypal.com"));
        url.add(new Url("Website","https://www.office.com"));
        url.add(new Url("Website","https://bitbucket.org"));
        url.add(new Url("Website","https://www.bit.ly"));
        url.add(new Url("Website","https://www.sourceforge.net"));
        url.add(new Url("Website","https://slack.com"));
        url.add(new Url("Website","https://www.dropbox.com"));
        url.add(new Url("Website","https://www.digitalocean.com"));

        //professional/job
        url.add(new Url("Website","https://www.indeed.com"));
        url.add(new Url("Website","https://www.monster.com"));
        url.add(new Url("Website","https://www.linkedin.com"));
        url.add(new Url("Website","https://www.glassdoor.com/index.htm"));
        url.add(new Url("Website","https://www.roberthalf.com"));
        url.add(new Url("Website","https://www.careerbuilder.com"));
        url.add(new Url("Website","https://www.simplyhired.com"));

        //shopping
        url.add(new Url("Website","https://www.amazon.com"));
        url.add(new Url("Website","https://www.ebay.com"));
        url.add(new Url("Website","https://www.aliexpress.com"));
        url.add(new Url("Website","https://www.taobao.com"));
        url.add(new Url("Website","https://www.etsy.com"));
        url.add(new Url("Website","https://www.rakuten.co.jp"));
        url.add(new Url("Website","https://www.gmarket.co.kr"));

        //academic/educational/
        url.add(new Url("Website","https://ashoka.iitp.ac.in"));
        url.add(new Url("Website","https://www.wikipedia.org"));
        url.add(new Url("Website","https://www.wikihow.com"));
        url.add(new Url("Website","https://www.webmd.com"));
        url.add(new Url("Website","https://www.grammarly.com"));
        url.add(new Url("Website","https://www.ted.com"));
        url.add(new Url("Website","https://archive.org"));
        url.add(new Url("Website","https://www.khanacademy.org"));
        url.add(new Url("Website","https://learncodeonline.in"));
        url.add(new Url("Website","https://www.freecodecamp.org"));
        url.add(new Url("Website","https://nptel.ac.in"));
        url.add(new Url("Website","https://swayam.gov.in"));
        url.add(new Url("Website","https://www.edx.org"));
        url.add(new Url("Website","https://dev.to"));

        //food/recipe
        url.add(new Url("Website","https://www.allrecipes.com"));
        url.add(new Url("Website","https://www.foodnetwork.com"));
        url.add(new Url("Website","https://www.yummly.com"));
        url.add(new Url("Website","https://www.chowhound.com"));
        url.add(new Url("Website","https://www.zomato.com"));
        url.add(new Url("Website","https://www.uber.com"));
        url.add(new Url("Website","https://www.swiggy.com"));

        //programming

        url.add(new Url("Website","https://raywenderlich.com"));
        url.add(new Url("Website","https://pluralsight.com"));


        url.add(new Url("Website","https://www.codecademy.com"));
        url.add(new Url("Website","https://www.udemy.com"));
        url.add(new Url("Website","https://www.edx.org"));
        url.add(new Url("Website","https://www.codewars.com"));
        url.add(new Url("Website","https://www.coursera.org"));
        url.add(new Url("Website","https://www.freecodecamp.org"));
        url.add(new Url("Website","https://www.udacity.com"));
        url.add(new Url("Website","https://ocw.mit.edu/index.htm"));
        url.add(new Url("Website","https://www.khanacademy.org/"));
        url.add(new Url("Website","https://www.theodinproject.com"));

        url.add(new Url("Website","https://www.makemytrip.com"));
        url.add(new Url("Website","https://www.easemytrip.com"));
        url.add(new Url("Website","https://www.goibibo.com"));
        url.add(new Url("Website","https://www.expedia.co.in"));
        url.add(new Url("Website","https://www.cleartrip.com"));
        url.add(new Url("Website","https://www.yatra.com"));
        url.add(new Url("Website","https://paytm.com"));
        url.add(new Url("Website","https://www.redbus.in"));
        url.add(new Url("Website","https://www.trivago.in"));
        url.add(new Url("Website","https://www.oyorooms.com"));

    }

    public void onUrlClick(Url url) {
        customTabsIntent.launchUrl(this, Uri.parse(url.getUrl()));
    }
}
