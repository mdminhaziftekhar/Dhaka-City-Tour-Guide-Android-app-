package com.dhakacitytourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class restaurantsFragment extends Fragment {

    public restaurantsFragment() {
        // Required empty public constructor
    }

    private valueAdapter restaurantsValueAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_list, container, false);

        List<valueClass> restaurants = new ArrayList<>();
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());
        restaurants.add(new valueClass());

        restaurantsValueAdapter = new valueAdapter(getActivity(), restaurants);
        ListView listView = (ListView) view.findViewById(R.id.list_new);
        listView.setAdapter(restaurantsValueAdapter);

        return view;
    }
}