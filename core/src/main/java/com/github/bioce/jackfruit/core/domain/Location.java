package com.github.bioce.jackfruit.core.domain;

/**
 * @author bioce
 * @date 2019/12/18
 */
public class Location {

    /**
     * 纬度
     */
    private double lat;

    /**
     * 经度
     */
    private double lon;

    public Location() {
    }

    public Location(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
