package com.piotrwysocki.warsawtourtop10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class JudaicaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judaica);

        TextView judaicaPolinPage = (TextView) findViewById(R.id.judaicaPolinPage);
        judaicaPolinPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.polin.pl/en";
                openWebPage(url);
            }
        });

        TextView judaicaSingerPage = (TextView) findViewById(R.id.judaicaFestivalsSingerPage);
        judaicaSingerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.festiwalsingera.pl/en";
                openWebPage(url);
            }
        });

        TextView judaicaFilmPage = (TextView) findViewById(R.id.judaicaFestivalsFilmPage);
        judaicaFilmPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.wjff.pl/en/";
                openWebPage(url);
            }
        });

        TextView worthKnowing = (TextView) findViewById(R.id.judaicaWorthKnowing);
        final LinearLayout worthKnowingBody = (LinearLayout) findViewById(R.id.judaicaWorthKnowingBody);
        final ImageView arrowK = (ImageView) findViewById(R.id.judaicaWorthKnowingArrow);
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

        TextView worthVisiting = (TextView) findViewById(R.id.judaicaWorthVisiting);
        final LinearLayout worthVisitingBody = (LinearLayout) findViewById(R.id.judaicaWorthVisitingBody);
        final ImageView arrowV = (ImageView) findViewById(R.id.judaicaWorthVisitingArrow);
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

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
