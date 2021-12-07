package com.choucair.models;

public class Location {

    private String name;
    private String address;
    private String longitude;
    private String latitude;


    public Location(String name, String address, String longitude, String latitude) {
        this.name = name;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }
}
