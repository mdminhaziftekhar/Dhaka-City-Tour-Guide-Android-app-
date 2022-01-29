package com.dhakacitytourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class fragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int PAGE_COUNT = 4;
    private Context context;

    public fragmentPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new placesFragment();
        } else if(position == 1){
            return new restaurantsFragment();
        } else if(position == 2) {
            return new mosquesFragment();
        } else {
            return new hospitalsFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
                return "Places";
            case 1 :
                return "Restaurants";
            case 2 :
                return "Mosques";
            case 3 :
                return "Hospitals";
            default : return null;
        }
    }
}
