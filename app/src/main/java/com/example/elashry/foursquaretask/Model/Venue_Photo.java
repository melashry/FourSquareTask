package com.example.elashry.foursquaretask.Model;

import com.google.gson.JsonObject;


public class Venue_Photo {
    private JsonObject meta;
    private PhotoResponse response;

    public JsonObject getMeta() {
        return meta;
    }

    public PhotoResponse getResponse() {
        return response;
    }
}
