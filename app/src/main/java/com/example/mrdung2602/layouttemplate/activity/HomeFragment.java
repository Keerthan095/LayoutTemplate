package com.example.mrdung2602.layouttemplate.activity;

/**
 * Created by Mrdung2602 on 10/9/2015.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mrdung2602.layouttemplate.R;

public class HomeFragment extends Fragment {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    TabHost tabHost;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        //Create view Tabhost
        tabHost = (TabHost) rootView.findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setIndicator("Map");
        tab1.setContent(R.id.contentTab1);
//        Intent intent;
//        intent = new Intent().setClass(getActivity(), MapsActivity.class);
//        tab1.setContent(intent);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2");
        tab2.setIndicator("Find Near By Me");
        tab2.setContent(R.id.contentTab2);
        tabHost.addTab(tab2);
        // Set color text in tab content
        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            TextView textTabContent = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            textTabContent.setTextColor(getResources().getColor(R.color.tabContent));
        }

        //Create view Spinner
        spinner = (Spinner) rootView.findViewById(R.id.spinnerSelectHome);
        adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.filter, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), parent.getItemAtPosition(position) + "selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return rootView;
    }
}
