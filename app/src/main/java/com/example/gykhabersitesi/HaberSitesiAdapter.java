package com.example.gykhabersitesi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HaberSitesiAdapter extends BaseAdapter {

    private List<HaberSitesi> haberSitesiList;
    private Context context;
    private LayoutInflater layoutInflater;

    public HaberSitesiAdapter(List<HaberSitesi> haberSitesiList, Context context) {
        this.haberSitesiList = haberSitesiList;
        this.context = context;
        this.layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return haberSitesiList.size();
    }

    @Override
    public Object getItem(int position) {
        return haberSitesiList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View resultView;
        resultView=layoutInflater.inflate(R.layout.each_item, null);
        ImageView imgView=resultView.findViewById(R.id.resim);
        TextView txtView=resultView.findViewById(R.id.siteAdi);

        HaberSitesi hs1=(HaberSitesi) getItem(position);
        imgView.setImageResource(hs1.getLogo());
        txtView.setText(hs1.getName());

        return resultView;
    }
}
