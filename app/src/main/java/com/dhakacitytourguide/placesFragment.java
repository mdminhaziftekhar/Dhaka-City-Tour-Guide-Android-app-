package com.dhakacitytourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class placesFragment extends Fragment {

    public placesFragment() {
        // Required empty public constructor
    }

    private valueAdapter placesValueAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_list, container, false);

        List<valueClass> places = new ArrayList<>();
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());
        places.add(new valueClass());

        placesValueAdapter = new valueAdapter(getActivity(), places);
        ListView listView = (ListView) view.findViewById(R.id.list_new);
        listView.setAdapter(placesValueAdapter);

        return view;
    }
}