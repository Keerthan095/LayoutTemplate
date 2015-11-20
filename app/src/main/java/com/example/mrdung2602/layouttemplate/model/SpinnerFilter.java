package com.example.mrdung2602.layouttemplate.model;

/**
 * Created by Mrdung2602 on 11/4/2015.
 */
public class SpinnerFilter {
    private String title;
    private int icon;

    public SpinnerFilter() {
    }

    public SpinnerFilter(String title, int icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
