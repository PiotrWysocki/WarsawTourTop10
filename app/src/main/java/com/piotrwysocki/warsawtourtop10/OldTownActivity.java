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

public class OldTownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_town);

        RelativeLayout oldTown = (RelativeLayout) findViewById(R.id.oldTownMap);

        oldTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "geo:0,0?q=Old+Town+Warsaw";
                showMap(Uri.parse(location));
            }
        });

        final TextView worthSeeing = (TextView) findViewById((R.id.oldTownWorthSeeing));
        final LinearLayout worthSeeingBody = (LinearLayout) findViewById((R.id.oldTownWorthSeeingBody));
        final ImageView arrowS = (ImageView) findViewById(R.id.oldTownWorthSeeingArrow);
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

        TextView royalCastle = (TextView) findViewById(R.id.royalCastlePage);

        royalCastle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.zamek-krolewski.pl/en";
                openWebPage(url);
            }
        });

        final TextView worthTrying = (TextView) findViewById((R.id.oldTownWorthTrying));
        final LinearLayout worthTryingBody = (LinearLayout) findViewById((R.id.oldTownWorthTryingBody));
        final ImageView arrowT = (ImageView) findViewById(R.id.oldTownWorthTryingArrow);
        worthTrying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (worthTryingBody.isShown() != true) {
                    worthTryingBody.setVisibility(View.VISIBLE);
                    worthTryingBody.setFocusable(true);
                    worthTryingBody.setFocusableInTouchMode(true);
                    worthTryingBody.requestFocus();
                    arrowT.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);

                } else {
                    worthTryingBody.setVisibility(View.GONE);
                    worthTryingBody.setFocusable(false);
                    worthTryingBody.setFocusableInTouchMode(false);
                    arrowT.setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
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
