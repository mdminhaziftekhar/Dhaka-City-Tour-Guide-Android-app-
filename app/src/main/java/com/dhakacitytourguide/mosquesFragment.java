package com.dhakacitytourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class mosquesFragment extends Fragment {

    public mosquesFragment() {
        // Required empty public constructor
    }

    private valueAdapter mosquesValueAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.new_list, container, false);

        List<valueClass> mosques = new ArrayList<>();
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());
        mosques.add(new valueClass());

        mosquesValueAdapter = new valueAdapter(getActivity(), mosques);
        ListView listView = (ListView) view.findViewById(R.id.list_new);
        listView.setAdapter(mosquesValueAdapter);

        return  view;
    }
}