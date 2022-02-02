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
        restaurants.add(new valueClass("Radisson blu", "Airport Rd, Dhaka Cantonment, Dhaka", R.drawable.radisson, "https://www.radissonhotels.com/en-us/hotels/radisson-blu-dhaka"));
        restaurants.add(new valueClass("Pan Pacific Sonargaon", "107 Kazi Nazrul Islam Avenue, Dhaka 1215", R.drawable.pan, "https://www.panpacific.com/en/hotels-and-resorts/pp-dhaka.html"));
        restaurants.add(new valueClass("Hotel 71", "Shaheed Syed Nazrul Islam Sarani, Dhaka", R.drawable.hotel_71, "https://hotel71.com.bd"));
        restaurants.add(new valueClass("Hotel Shuktara", "Indira Road, near Tejgoan Collage, 1215 Dhaka", R.drawable.hotel_shuktara, "https://www.booking.com/hotel/bd/shuktara.html"));
        restaurants.add(new valueClass("Richmond hotel & suites", "Uttara, Dhaka", R.drawable.richmond, "https://richmondhs.com"));
        restaurants.add(new valueClass("Hotel Star City", "Motijheel, 1217 Dhaka", R.drawable.hotel_star_city, "https://www.booking.com/hotel/bd/star-city-intl-dhaka.html"));
        restaurants.add(new valueClass("Civic Inn", "Uttara, 1230 Dhaka", R.drawable.civic, "https://www.booking.com/hotel/bd/civic-inn-dhaka1.html"));
        restaurants.add(new valueClass("Hotel Blue Bird", "Uttara , Dhaka 1230", R.drawable.hotel_blue_bird, "https://www.booking.com/hotel/bd/bluebird-ltd.html"));
        restaurants.add(new valueClass("Hotel Ornate", "Bijaynagar Dhaka, 1000 Dhaka", R.drawable.hotel_ornate, "https://www.booking.com/hotel/bd/ornate-dhaka1.html"));

        restaurantsValueAdapter = new valueAdapter(getActivity(), restaurants);
        ListView listView = (ListView) view.findViewById(R.id.list_new);
        listView.setAdapter(restaurantsValueAdapter);

        return view;
    }
}