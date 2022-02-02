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
        mosques.add(new valueClass("Baitul Mukarram", "Baitul Mukarram, Dhaka", R.drawable.baitul_mukarram, "https://en.wikipedia.org/wiki/Baitul_Mukarram_National_Mosque"));
        mosques.add(new valueClass("Star Mosque", "Dhaka, Bangladesh", R.drawable.star, "https://en.wikipedia.org/wiki/Star_Mosque"));
        mosques.add(new valueClass("The khan muhammad mirja mosque", "Lalbagh road, Dhaka", R.drawable.khan_muhammad_mirja_mosque, "https://en.wikipedia.org/wiki/Khan_Mohammad_Mridha_Mosque"));
        mosques.add(new valueClass("Chawk mosque", "Chowk Bazaar, Dhaka", R.drawable.chawk, "https://en.wikipedia.org/wiki/Chawk_Mosque"));
        mosques.add(new valueClass("Kartalab khan mosque", "Begum Bazar, Old Dhaka", R.drawable.kartalab, "https://en.wikipedia.org/wiki/Kartalab_Khan_Mosque"));
        mosques.add(new valueClass("Hussaini Dalan", "Dhaka, Bangladesh", R.drawable.hussaini_dalan, "https://en.wikipedia.org/wiki/Hussaini_Dalan"));
        mosques.add(new valueClass("Sath Gambuj", "Mohammadpur, Dhaka", R.drawable.shat, "https://en.wikipedia.org/wiki/Sat_Gambuj_Mosque"));
        mosques.add(new valueClass("Binat bibi", "Narinda, Dhaka", R.drawable.binat_bibi, "https://en.wikipedia.org/wiki/Binat_Bibi_Mosque"));

        mosquesValueAdapter = new valueAdapter(getActivity(), mosques);
        ListView listView = (ListView) view.findViewById(R.id.list_new);
        listView.setAdapter(mosquesValueAdapter);

        return  view;
    }
}