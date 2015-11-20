package com.example.mrdung2602.layouttemplate.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.mrdung2602.layouttemplate.model.NavDrawerItem;
import com.example.mrdung2602.layouttemplate.model.SpinnerFilter;

import java.util.ArrayList;

/**
 * Created by Mrdung2602 on 11/4/2015.
 */
public class SpinnerFilterListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<SpinnerFilter> arrayListFilter;

    public SpinnerFilterListAdapter(Context context, ArrayList<SpinnerFilter> arrayListFilter) {
        this.context = context;
        this.arrayListFilter = arrayListFilter;
    }

    @Override
    public int getCount() {
        return arrayListFilter.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListFilter.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    private static class ViewHolder{}
}
