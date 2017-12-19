package com.example.elashry.foursquaretask.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.example.elashry.foursquaretask.Connection.PhotoConnection;
import com.example.elashry.foursquaretask.Model.PhotoItem;
import com.example.elashry.foursquaretask.Model.PlaceItem;
import com.example.elashry.foursquaretask.Model.PlaceVenue;
import com.example.elashry.foursquaretask.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PlacesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.place_image)
    NetworkImageView placeImage;
    @BindView(R.id.place_name)
    TextView placeName;
    @BindView(R.id.place_address)
    TextView placeAddress;

    public PlacesViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void bind(PlaceItem place) {
        PlaceVenue placeVenue = place.getVenue();
        PhotoConnection.getPhoto(itemView.getContext(), this, placeVenue.getId());
        placeName.setText(placeVenue.getName());
        placeAddress.setText(placeVenue.getLocation().getAddress());
    }

    public void setPhoto(PhotoItem photoItem) {
        String imageUrl = photoItem.getPrefix() + "300x500" + photoItem.getSuffix();
        PhotoConnection.loadPhoto(itemView.getContext(), imageUrl, placeImage);
    }

    public void setPlaceHolder() {
        placeImage.setBackground(itemView.getContext().getResources().getDrawable(R.drawable.ic_image));
    }
}
