package com.dhakacitytourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class hospitalsFragment extends Fragment {

    public hospitalsFragment() {
        // Required empty public constructor
    }

    private valueAdapter hospitalsValueAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_list, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_new);

        List<valueClass> hospitals = new ArrayList<>();
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());
        hospitals.add(new valueClass());

        hospitalsValueAdapter = new valueAdapter(getActivity(), hospitals);

        listView.setAdapter(hospitalsValueAdapter);

        return view;
    }
}