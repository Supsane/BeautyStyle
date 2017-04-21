package com.chashurinevgeny.beautystyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static String service = "";
    private View hairView;
    private View nailView;
    private View addressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hairView = findViewById(R.id.hair);
        nailView = findViewById(R.id.nail);
        addressView = findViewById(R.id.address);
        hairView.setOnClickListener(this);
        nailView.setOnClickListener(this);
        addressView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(hairView)) {
            service = "hair";
            Intent intent = new Intent(this, ServicesCategoryActivity.class);
            startActivity(intent);
        }

        if (view.equals(nailView)) {
            service = "nail";
            Intent intent = new Intent(this, ServicesCategoryActivity.class);
            startActivity(intent);
        }

        if (view.equals(addressView)) {
            Intent intent = new Intent(this, AdressActivity.class);
            startActivity(intent);
        }
    }
}
