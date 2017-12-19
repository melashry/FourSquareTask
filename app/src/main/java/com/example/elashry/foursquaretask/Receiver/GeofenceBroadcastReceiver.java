package com.example.elashry.foursquaretask.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.example.elashry.foursquaretask.MainActivity;
import com.example.elashry.foursquaretask.R;
import com.example.elashry.foursquaretask.Utilities.Utilities;



public class GeofenceBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = GeofenceBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        int geofenceTransition = GeofencingEvent.fromIntent(intent).getGeofenceTransition();
        switch (geofenceTransition) {
            case Geofence.GEOFENCE_TRANSITION_EXIT:
                if (Utilities.getOperationalMode(context).equals(context.getString(R.string.realtimeKey))) {
                    MainActivity.changeLocation();
                }
                break;
            default:
                Log.e(TAG, String.format("Unknown transition : %d", geofenceTransition));
                return;

        }
    }
}
