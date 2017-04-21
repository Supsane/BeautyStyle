package com.chashurinevgeny.beautystyle;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Chashurin Evgeny on 21.04.2017.
 */

public class ServicesCategoryActivity extends ListActivity {

    static final String HAIR = "hair";
    static final String NAIL = "nail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();

        if ((MainActivity.service).equals(HAIR)) {
            BaseAdapterCreateListService baseAdapterCreateListService = new BaseAdapterCreateListService(this, getStringArray(Services.hairs), getImageId(Services.hairs));
            listView.setAdapter(baseAdapterCreateListService);
        } else if ((MainActivity.service).equals(NAIL)) {
            BaseAdapterCreateListService baseAdapterCreateListService = new BaseAdapterCreateListService(this, getStringArray(Services.nails), getImageId(Services.nails));
            listView.setAdapter(baseAdapterCreateListService);
        }
    }

    private String[] getStringArray(Services[] services) {
        int count = services.length;
        String[] array = new String[count];
        for (int i = 0; i < count; i++) {
            array[i] = getResources().getString(services[i].getName());
        }
        return array;
    }

    private Integer[] getImageId(Services[] services) {
        int count = services.length;
        Integer[] array = new Integer[count];
        for (int i = 0; i < count; i++) {
            array[i] = services[i].getImageResourceId();
        }
        return array;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(ServicesCategoryActivity.this, ServicesActivity.class);
        intent.putExtra(ServicesActivity.EXTRA_NOM, (int) id);
        startActivity(intent);
    }
}
