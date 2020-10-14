package com.moringaschool.myrestaurants;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;

public class MyRestaurantsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurants;
    private  String[] mCuisines;

    public MyRestaurantsArrayAdapter( Context mcontext, int resource, String[] mRestaurants, String[] mCuisines) {
        super(mcontext, resource);
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position) {
        String restaurant = mRestaurants [position];
        String cuisine = mCuisines[position];

        return String.format("%s  \nServes  great: %s", restaurant,cuisine);
    }

    @Override
    public int getCount() {
        return mRestaurants.length;
    }
}
