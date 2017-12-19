package com.example.elashry.foursquaretask.Model;

import com.google.gson.JsonObject;



public class Venue_Place {
    private JsonObject meta;
    private PlaceResponse response;

    public JsonObject getMeta() {
        return meta;
    }

    public PlaceResponse getResponse() {
        return response;
    }
}
