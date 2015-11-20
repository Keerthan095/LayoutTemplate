package com.example.mrdung2602.layouttemplate.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mrdung2602.layouttemplate.R;

/**
 * Created by Mrdung2602 on 11/4/2015.
 */
public class DirectionFragment extends Fragment {
    public DirectionFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_direction, container, false);
        return rootView;
    }
}
