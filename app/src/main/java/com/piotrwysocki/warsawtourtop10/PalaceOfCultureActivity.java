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

public class PalaceOfCultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palace_of_culture);

        RelativeLayout palaceOfCultureMap = (RelativeLayout) findViewById(R.id.palaceOfCultureMap);
        palaceOfCultureMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "geo:0,0?q=Palace+of+Culture+and+Science";
                showMap(Uri.parse(location));
            }
        });

        RelativeLayout palaceOfCulturePage = (RelativeLayout) findViewById(R.id.palaceOfCulturePage);
        palaceOfCulturePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.pkin.pl/eng";
                openWebPage(url);
            }
        });

        TextView palaceOfCulturePeregrinusPage = (TextView) findViewById(R.id.palaceOfCulturePeregrinusPage);
        palaceOfCulturePeregrinusPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://webcam.peregrinus.pl/en/preview-falcon-nests-live";
                openWebPage(url);
            }
        });

        TextView worthSeeing = (TextView) findViewById(R.id.palaceOfCultureWorthSeeing);
        final LinearLayout worthSeeingBody = (LinearLayout) findViewById(R.id.palaceOfCultureWorthSeeingBody);
        final ImageView arrowS = (ImageView) findViewById(R.id.palaceOfCultureWorthSeeingArrow);
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

        TextView worthKnowing = (TextView) findViewById(R.id.palaceOfCultureWorthKnowing);
        final LinearLayout worthKnowingBody = (LinearLayout) findViewById(R.id.palaceOfCultureWorthKnowingBody);
        final ImageView arrowK = (ImageView) findViewById(R.id.palaceOfCultureWorthKnowingArrow);
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
