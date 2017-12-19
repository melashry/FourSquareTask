package com.example.elashry.foursquaretask.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.elashry.foursquaretask.Model.PlaceItem;
import com.example.elashry.foursquaretask.R;
import com.example.elashry.foursquaretask.ViewHolder.PlacesViewHolder;

import java.util.ArrayList;



public class PlacesAdapter extends RecyclerView.Adapter<PlacesViewHolder> {

    private Activity activity;
    private ArrayList<PlaceItem> places;

    public PlacesAdapter(Activity activity, ArrayList<PlaceItem> places) {
        this.activity = activity;
        this.places = places;
    }


    @Override
    public PlacesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = activity.getLayoutInflater().inflate(R.layout.item_place,
                parent, false);

        return new PlacesViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(PlacesViewHolder holder, int position) {
        holder.bind(places.get(position));
    }

    @Override
    public int getItemCount() {
        return places.size();
    }
}
