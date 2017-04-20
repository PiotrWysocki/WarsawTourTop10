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

public class RisingMuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rising_museum);

        RelativeLayout risingMuseumMap = (RelativeLayout) findViewById(R.id.risingMuseumMap);
        risingMuseumMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "geo:0,0?q=Warsaw+Rising+Museum";
                showMap(Uri.parse(location));
            }
        });

        RelativeLayout risingMuseumPage = (RelativeLayout) findViewById(R.id.risingMuseumPage);
        risingMuseumPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.1944.pl/en";
                openWebPage(url);
            }
        });

        TextView worthKnowing = (TextView) findViewById(R.id.risingMuseumWorthKnowing);
        final LinearLayout worthKnowingBody = (LinearLayout) findViewById(R.id.risingMuseumWorthKnowingBody);
        final ImageView arrowK = (ImageView) findViewById(R.id.risingMuseumWorthKnowingArrow);
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

        TextView worthHearing = (TextView) findViewById(R.id.risingMuseumWorthHearing);
        final LinearLayout worthHearingBody = (LinearLayout) findViewById(R.id.risingMuseumWorthHearingBody);
        final ImageView arrowH = (ImageView) findViewById(R.id.risingMuseumWorthHearingArrow);
        worthHearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (worthHearingBody.isShown() != true) {
                    worthHearingBody.setVisibility(View.VISIBLE);
                    worthHearingBody.setFocusable(true);
                    worthHearingBody.setFocusableInTouchMode(true);
                    worthHearingBody.requestFocus();
                    arrowH.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);

                } else {
                    worthHearingBody.setVisibility(View.GONE);
                    worthHearingBody.setFocusable(false);
                    worthHearingBody.setFocusableInTouchMode(false);
                    arrowH.setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
                }
            }
        });

        TextView worthSeeing = (TextView) findViewById(R.id.risingMuseumWorthSeeing);
        final LinearLayout worthSeeingBody = (LinearLayout) findViewById(R.id.risingMuseumWorthSeeingBody);
        final ImageView arrowS = (ImageView) findViewById(R.id.risingMuseumWorthSeeingArrow);
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
