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

public class FryderykChopinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fryderyk_chopin);

        RelativeLayout fryderykChopin = (RelativeLayout) findViewById(R.id.fryderykChopinPage);

        fryderykChopin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://en.chopin.warsawtour.pl";
                openWebPage(url);
            }
        });

        TextView fryderykChopinRoyalLazienki = (TextView) findViewById(R.id.fryderykChopinRoyalLazienkiPage);

        fryderykChopinRoyalLazienki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http:/www.lazienki-krolewskie.pl/en";
                openWebPage(url);
            }
        });

        TextView fryderykChopinFestiwal = (TextView) findViewById(R.id.fryderykChopinFestiwalPage);

        fryderykChopinFestiwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.festiwal.nifc.pl/en/";
                openWebPage(url);
            }
        });

        TextView fryderykChopinMuseum = (TextView) findViewById(R.id.fryderykChopinMuseumPage);

        fryderykChopinMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://chopin.museum/en";
                openWebPage(url);
            }
        });

        final TextView worthListening = (TextView) findViewById((R.id.fryderykChopinWorthListening));
        final LinearLayout worthListeningBody = (LinearLayout) findViewById((R.id.fryderykChopinWorthListeningBody));
        final ImageView arrowL = (ImageView) findViewById(R.id.fryderykChopinWorthListeningArrow);
        worthListening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (worthListeningBody.isShown() != true) {
                    worthListeningBody.setVisibility(View.VISIBLE);
                    worthListeningBody.setFocusable(true);
                    worthListeningBody.setFocusableInTouchMode(true);
                    worthListeningBody.requestFocus();
                    arrowL.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);

                } else {
                    worthListeningBody.setVisibility(View.GONE);
                    worthListeningBody.setFocusable(false);
                    worthListeningBody.setFocusableInTouchMode(false);
                    arrowL.setImageResource(R.drawable.ic_keyboard_arrow_right_white_24dp);
                }
            }
        });

        final TextView worthSeeing = (TextView) findViewById((R.id.fryderykChopinWorthSeeing));
        final LinearLayout worthSeeingBody = (LinearLayout) findViewById((R.id.fryderykChopinWorthSeeingBody));
        final ImageView arrowS = (ImageView) findViewById(R.id.fryderykChopinWorthSeeingArrow);
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

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
