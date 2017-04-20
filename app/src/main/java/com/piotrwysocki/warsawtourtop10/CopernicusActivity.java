package com.piotrwysocki.warsawtourtop10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CopernicusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copernicus);

        RelativeLayout copernicusMap = (RelativeLayout) findViewById(R.id.copernicusMap);
        copernicusMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "geo:0,0?q=Copernicus+Science+Centre";
                showMap(Uri.parse(location));
            }
        });

        RelativeLayout copernicusPage = (RelativeLayout) findViewById(R.id.copernicusPage);
        copernicusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.kopernik.org.pl/en";
                openWebPage(url);
            }
        });

        TextView copernicusTicketsPage = (TextView) findViewById(R.id.copernicusTicketsPage);
        copernicusTicketsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://bilety.kopernik.org.pl/";
                openWebPage(url);
            }
        });

        TextView worthKnowing = (TextView) findViewById(R.id.copernicusWorthKnowing);
        final LinearLayout worthKnowingBody = (LinearLayout) findViewById(R.id.copernicusWorthKnowingBody);
        final ImageView arrowK = (ImageView) findViewById(R.id.copernicusWorthKnowingArrow);
        worthKnowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (worthKnowingBody.isShown() != true) {
                    worthKnowingBody.setVisibility(View.VISIBLE);
                    worthKnowingBody.setFocusable(true);
                    worthKnowingBody.setFocusableInTouchMode(true);
                    worthKnowingBody.requestFocus();
                    arrowK.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);

                } else {
                    worthKnowingBody.setVisibility(View.GONE);
                    worthKnowingBody.setFocusable(false);
                    worthKnowingBody.setFocusableInTouchMode(false);
                    arrowK.setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
                }
            }
        });
    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
