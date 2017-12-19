package com.example.elashry.foursquaretask.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;



public class PlaceGroup implements Parcelable {
    private ArrayList<PlaceItem> items;

    protected PlaceGroup(Parcel in) {
    }

    public static final Creator<PlaceGroup> CREATOR = new Creator<PlaceGroup>() {
        @Override
        public PlaceGroup createFromParcel(Parcel in) {
            return new PlaceGroup(in);
        }

        @Override
        public PlaceGroup[] newArray(int size) {
            return new PlaceGroup[size];
        }
    };

    public ArrayList<PlaceItem> getItems() {
        return items;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
