package com.chashurinevgeny.beautystyle;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Chashurin Evgeny on 21.04.2017.
 */

public class BaseAdapterCreateListService extends BaseAdapter {

    private final Activity context;
    private final String[] nameService;
    private final Integer[] imgServiceId;

    public BaseAdapterCreateListService(Activity context, String[] nameService, Integer[] imgServiceId) {
        this.context = context;
        this.nameService = nameService;
        this.imgServiceId = imgServiceId;
    }


    @Override
    public int getCount() {
        return nameService.length;
    }

    @Override
    public Object getItem(int position) {
        return nameService[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View myView = inflater.inflate(R.layout.my_list, null, true);

        TextView textView = (TextView) myView.findViewById(R.id.nameService);
        ImageView imageView = (ImageView) myView.findViewById(R.id.imageService);

        textView.setText(nameService[position]);
        imageView.setImageResource(imgServiceId[position]);

        return myView;
    }
}
