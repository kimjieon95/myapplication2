package com.example.a512_3.jieon;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by 512-3 on 2017-03-15.
 */

public class MyLocationLx implements LocationListener {

    public double altitude, latitude, longitude;

    @Override
    public void onLocationChanged(Location location) {
        altitude = location.getAltitude();
        latitude = location.getLatitude();
        longitude = location.getLongitude();

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
