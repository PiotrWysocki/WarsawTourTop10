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

public class NationalMuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_museum);

        RelativeLayout nationalMuseumMap = (RelativeLayout) findViewById(R.id.nationalMuseumMap);
        nationalMuseumMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "geo:0,0?q=National+Museum+in+Warsaw";
                showMap(Uri.parse(location));
            }
        });

        RelativeLayout nationalMuseumPage = (RelativeLayout) findViewById(R.id.nationalMuseumPage);
        nationalMuseumPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mnw.art.pl/en/";
                openWebPage(url);
            }
        });

        TextView worthSeeing = (TextView) findViewById(R.id.nationalMuseumWorthSeeing);
        final LinearLayout worthSeeingBody = (LinearLayout) findViewById(R.id.nationalMuseumWorthSeeingBody);
        final ImageView arrowS = (ImageView) findViewById(R.id.nationalMuseumWorthSeeingArrow);
        worthSeeing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (worthSeeingBody.isShown() != true) {
                    worthSeeingBody.setVisibility(View.VISIBLE);
                    worthSeeingBody.setFocusable(true);
                    worthSeeingBody.setFocusableInTouchMode(true);
                    worthSeeingBody.requestFocus();
                    arrowS.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);

                } else {
                    worthSeeingBody.setVisibility(View.GONE);
                    worthSeeingBody.setFocusable(false);
                    worthSeeingBody.setFocusableInTouchMode(false);
                    arrowS.setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
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
