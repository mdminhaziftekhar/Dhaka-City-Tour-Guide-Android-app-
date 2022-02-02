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
        places.add(new valueClass("Ahsan Manzil", "Kumartoli, Dhaka", R.drawable.ahsan_manzil, "https://en.wikipedia.org/wiki/Ahsan_Manzil"));
        places.add(new valueClass("Lalbagh Fort", "Lalbagh, Old Dhaka", R.drawable.lalbagh, "https://en.wikipedia.org/wiki/Lalbagh_Fort"));
        places.add(new valueClass("Sadarghat", "Old Dhaka", R.drawable.sadarghat, "https://en.wikipedia.org/wiki/Port_of_Dhaka"));
        places.add(new valueClass("Kawran Bazar", "Kawran Bazar, Dhaka", R.drawable.kawran, "https://en.wikipedia.org/wiki/Kawran_Bazar"));
        places.add(new valueClass("Dhaka Shipyard", "Keraniganj, Dhaka", R.drawable.dhaka_shipyard, "https://www.atlasobscura.com/places/dhaka-shipyard"));
        places.add(new valueClass("Armenian Church", "Armanitola, Dhaka", R.drawable.armenian_church, "https://en.wikipedia.org/wiki/Armenian_Church,_Dhaka"));
        places.add(new valueClass("Shakhari Bazar", "Old Dhaka", R.drawable.shakari, "https://en.wikipedia.org/wiki/Shankhari_Bazaar"));
        places.add(new valueClass("Liberation war museum", "Sher-e Bangla Nagar, Agargaon, Dhaka", R.drawable.liberation, "https://www.liberationwarmuseumbd.org/"));
        places.add(new valueClass("Parliament Building", "Sher-e-Bangla Nagar, Dhaka", R.drawable.parliament, "https://en.wikipedia.org/wiki/Jatiya_Sangsad_Bhaban"));

        placesValueAdapter = new valueAdapter(getActivity(), places);
        ListView listView = (ListView) view.findViewById(R.id.list_new);
        listView.setAdapter(placesValueAdapter);

        return view;
    }
}