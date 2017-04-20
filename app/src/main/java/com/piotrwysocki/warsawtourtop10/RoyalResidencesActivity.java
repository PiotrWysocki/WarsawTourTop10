package com.piotrwysocki.warsawtourtop10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RoyalResidencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royal_residences);

        TextView royalResidencesLazienkiPage = (TextView) findViewById(R.id.royalResidencesLazienkiPage);
        royalResidencesLazienkiPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.lazienki-krolewskie.pl/en";
                openWebPage(url);

            }
        });

        TextView royalResidencesWilanowPage = (TextView) findViewById(R.id.royalResidencesWilanowPage);
        royalResidencesWilanowPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.wilanow-palac.pl/en";
                openWebPage(url);

            }
        });

        TextView worthSeeing = (TextView) findViewById(R.id.royalResidencesLazienkiWorthSeeing);
        final LinearLayout worthSeeingBody = (LinearLayout) findViewById(R.id.royalResidencesLazienkiWorthSeeingBody);
        final ImageView arrowS = (ImageView) findViewById(R.id.royalResidencesLazienkiWorthSeeingArrow);
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

        TextView worthSeeingWilanow = (TextView) findViewById(R.id.royalResidencesWilanowWorthSeeing);
        final LinearLayout worthSeeingBodyWilanow = (LinearLayout) findViewById(R.id.royalResidencesWilanowWorthSeeingBody);
        final ImageView arrowSWilanow = (ImageView) findViewById(R.id.royalResidencesWilanowWorthSeeingArrow);
        worthSeeingWilanow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (worthSeeingBodyWilanow.isShown() != true) {
                    worthSeeingBodyWilanow.setVisibility(View.VISIBLE);
                    worthSeeingBodyWilanow.setFocusable(true);
                    worthSeeingBodyWilanow.setFocusableInTouchMode(true);
                    worthSeeingBodyWilanow.requestFocus();
                    arrowSWilanow.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);

                } else {
                    worthSeeingBodyWilanow.setVisibility(View.GONE);
                    worthSeeingBodyWilanow.setFocusable(false);
                    worthSeeingBodyWilanow.setFocusableInTouchMode(false);
                    arrowSWilanow.setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
                }
            }
        });

        TextView worthKnowing = (TextView) findViewById(R.id.royalResidencesWilanowWorthKnowing);
        final LinearLayout worthKnowingBody = (LinearLayout) findViewById(R.id.royalResidencesWilanowWorthKnowingBody);
        final ImageView arrowK = (ImageView) findViewById(R.id.royalResidencesWilanowWorthKnowingArrow);
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

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
