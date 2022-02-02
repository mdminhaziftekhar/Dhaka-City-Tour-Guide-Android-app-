package com.dhakacitytourguide;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class valueAdapter extends ArrayAdapter<valueClass> {

    public valueAdapter(Activity context, List<valueClass> values) {
        super(context, 0, values);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //finding the current position
        final valueClass currentVal = getItem(position);

        //Imageview for the picture of each list item
        ImageView listImage = (ImageView) listItemView.findViewById(R.id.picture);

        //set the imageview to the image id we sent
        listImage.setImageResource(currentVal.getmImageResourceId());

        //setting the title text
        TextView titleText = (TextView) listItemView.findViewById(R.id.titleText);
        titleText.setText(currentVal.getmTitle());

        //setting the description text
        TextView descriptionText = (TextView) listItemView.findViewById(R.id.descriptionText);
        descriptionText.setText(currentVal.getmDescription());

        //On click function will be initialized here
        //listItemView copied to avoid error
        View finalListItemView = listItemView;

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try{
                   String url = currentVal.getmUrl();
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                   //view.getcontext() is used before startActivity in adapters
                   finalListItemView.getContext().startActivity(browserIntent);

               }catch (ActivityNotFoundException e) {
                   e.printStackTrace();
               }
            }
        });

        return listItemView;

    }
}
