package com.chashurinevgeny.beautystyle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Chashurin Evgeny on 21.04.2017.
 */

public class ServicesActivity extends AppCompatActivity {

    public static final String EXTRA_NOM = "nom";
    public Services services = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_services);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int nom = bundle.getInt(EXTRA_NOM);
            if ((MainActivity.service).equals("hair")) {
                services = Services.hairs[nom];
            } else if ((MainActivity.service).equals("nail")) {
                services = Services.nails[nom];
            }

            ImageView imageService = (ImageView) findViewById(R.id.photo);
            imageService.setImageResource(services.getImageResourceId());
            imageService.setContentDescription(getResources().getString(services.getName()));

            TextView name = (TextView) findViewById(R.id.name);
            name.setText(services.getName());

            TextView description = (TextView) findViewById(R.id.description);
            description.setText(services.getDescription());
        }
    }
}
