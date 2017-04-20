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

public class PGENarodowyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgenarodowy);

        RelativeLayout pgeNarodowyMap = (RelativeLayout) findViewById(R.id.pgeNarodowyMap);
        pgeNarodowyMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "geo:0,0?q=PGE+Narodowy+stadium";
                showMap(Uri.parse(location));
            }
        });

        RelativeLayout pgeNarodowyPage = (RelativeLayout) findViewById(R.id.pgeNarodowyPage);
        pgeNarodowyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.en.pgenarodowy.pl";
                openWebPage(url);
            }
        });

        TextView pgeNarodowyWholeStadiumPage = (TextView) findViewById(R.id.pgeNarodowyWholeStadiumPage);
        pgeNarodowyWholeStadiumPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.en.pgenarodowy.pl/our-place/visiting-the-stadium";
                openWebPage(url);
            }
        });

        TextView worthKnowing = (TextView) findViewById(R.id.pgeNarodowyWorthKnowing);
        final LinearLayout worthKnowingBody = (LinearLayout) findViewById(R.id.pgeNarodowyWorthKnowingBody);
        final ImageView arrowK = (ImageView) findViewById(R.id.pgeNarodowyWorthKnowingArrow);
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

        TextView worthVisiting = (TextView) findViewById(R.id.pgeNarodowyWorthVisiting);
        final LinearLayout worthVisitingBody = (LinearLayout) findViewById(R.id.pgeNarodowyWorthVisitingBody);
        final ImageView arrowV = (ImageView) findViewById(R.id.pgeNarodowyWorthVisitingArrow);
        worthVisiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (worthVisitingBody.isShown() != true) {
                    worthVisitingBody.setVisibility(View.VISIBLE);
                    worthVisitingBody.setFocusable(true);
                    worthVisitingBody.setFocusableInTouchMode(true);
                    worthVisitingBody.requestFocus();
                    arrowV.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);

                } else {
                    worthVisitingBody.setVisibility(View.GONE);
                    worthVisitingBody.setFocusable(false);
                    worthVisitingBody.setFocusableInTouchMode(false);
                    arrowV.setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
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
