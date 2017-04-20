package com.piotrwysocki.warsawtourtop10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Old Town category
        TextView oldTown = (TextView) findViewById(R.id.old_town);

        // Set a click listener on that View
        oldTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oldTownIntent = new Intent(MainActivity.this, OldTownActivity.class);
                startActivity(oldTownIntent);
            }
        });

        // Find the View that shows the Fryderyk Chopin's Warsaw category
        TextView fryderykChopin = (TextView) findViewById(R.id.fryderyk_chopin);

        // Set a click listener on that View
        fryderykChopin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fryderykChopinIntent = new Intent(MainActivity.this, FryderykChopinActivity.class);
                startActivity(fryderykChopinIntent);
            }
        });

        // Find the View that shows the Warsaw Rising Museumn category
        TextView risingMuseum = (TextView) findViewById(R.id.rising_museum);

        // Set a click listener on that View
        risingMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent risingMuseumIntent = new Intent(MainActivity.this, RisingMuseumActivity.class);
                startActivity(risingMuseumIntent);
            }
        });

        // Find the View that shows the Palace of Culture and Science category
        TextView palaceOfCulture = (TextView) findViewById(R.id.palace_of_culture);

        // Set a click listener on that View
        palaceOfCulture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent palaceOfCultureIntent = new Intent(MainActivity.this, PalaceOfCultureActivity.class);
                startActivity(palaceOfCultureIntent);
            }
        });

        // Find the View that shows the Royal Residences category
        TextView royalResidences = (TextView) findViewById(R.id.royal_residences);

        // Set a click listener on that View
        royalResidences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent royalResidencesIntent = new Intent(MainActivity.this, RoyalResidencesActivity.class);
                startActivity(royalResidencesIntent);
            }
        });

        // Find the View that shows the Judaica category
        TextView judaica = (TextView) findViewById(R.id.judaica);

        // Set a click listener on that View
        judaica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent judaicaIntent = new Intent(MainActivity.this, JudaicaActivity.class);
                startActivity(judaicaIntent);
            }
        });

        // Find the View that shows the Copernicus Science Centre category
        TextView copernicus = (TextView) findViewById(R.id.copernicus);

        // Set a click listener on that View
        copernicus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent copernicusIntent = new Intent(MainActivity.this, CopernicusActivity.class);
                startActivity(copernicusIntent);
            }
        });

        // Find the View that shows the National Museum category
        TextView nationalMuseum = (TextView) findViewById(R.id.national_museum);

        // Set a click listener on that View
        nationalMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nationalMuseumIntent = new Intent(MainActivity.this, NationalMuseumActivity.class);
                startActivity(nationalMuseumIntent);
            }
        });

        // Find the View that shows the Vistula category
        TextView vistula = (TextView) findViewById(R.id.vistula);

        // Set a click listener on that View
        vistula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vistulaIntent = new Intent(MainActivity.this, VistulaActivity.class);
                startActivity(vistulaIntent);
            }
        });

        // Find the View that shows the PGE Narodowy stadium category
        TextView pgeNarodowy = (TextView) findViewById(R.id.pge_narodowy_stadium);

        // Set a click listener on that View
        pgeNarodowy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pgeNarodowyIntent = new Intent(MainActivity.this, PGENarodowyActivity.class);
                startActivity(pgeNarodowyIntent);
            }
        });

    }

}
