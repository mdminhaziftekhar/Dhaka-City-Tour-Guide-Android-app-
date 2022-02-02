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
        hospitals.add(new valueClass("Square", "Pallabi, Dhaka- 1216", R.drawable.square, "https://www.squarehospital.com"));
        hospitals.add(new valueClass("Bangabandhu Medical University", "Panthapath, Dhaka", R.drawable.bangabandhu_medical, "https://heliumdoc.com/bd/clinic/bangabandhu-sheikh-mujib-medical-university-hospital"));
        hospitals.add(new valueClass("Evercare", "Bashundhara R/A, Dhaka 1229", R.drawable.evercare, "https://www.evercarebd.com/dhaka"));
        hospitals.add(new valueClass("Dhaka Medical", "Dhaka - 1000", R.drawable.dhaka_medical, "http://dmc.gov.bd"));
        hospitals.add(new valueClass("United Hospital", "Gulshan, Dhaka 1212", R.drawable.united, "https://www.uhlbd.com"));
        hospitals.add(new valueClass("Labaid", "Dhanmondi, Dhaka", R.drawable.labaid, "https://labaidgroup.com/specialized/appointment"));
        hospitals.add(new valueClass("Kurmitola General", " New Airport Road, Kurmitola, Dhaka Cantonment", R.drawable.kurmitola, "https://kgh.gov.bd"));
        hospitals.add(new valueClass("Birdem", "Shahbag, Dhaka", R.drawable.birdem, "https://www.birdembd.org"));
        hospitals.add(new valueClass("Green Life", "Green Road, Dhaka", R.drawable.green_life, "https://www.greenlife.edu.bd"));
        hospitals.add(new valueClass("National heart foundation", "Dhaka 1216", R.drawable.national_heart_foundation, "https://www.nhf.org.bd/"));

        hospitalsValueAdapter = new valueAdapter(getActivity(), hospitals);

        listView.setAdapter(hospitalsValueAdapter);

        return view;
    }
}