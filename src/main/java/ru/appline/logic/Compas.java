package ru.appline.logic;

public class Compas {
private static String northEast = "northEast";
private static String northWest = "northWest";
private static String southEast = "southEast";
private static String southWest = "southWest";
private static String north = "north";
private static String south = "south";
private static String east = "east";
private static String west = "west";

    public Compas() {
        super();
    }

    public Compas(String northEast, String northWest, String southEast, String southWest, String north, String south, String east, String west) {
        Compas.northEast = northEast;
        Compas.northWest = northWest;
        Compas.southEast = southEast;
        Compas.southWest = southWest;
        Compas.north = north;
        Compas.south = south;
        Compas.east = east;
        Compas.west = west;
    }

    public static String getNorthEast() {
        return northEast;
    }

    public void setNorthEast(String northEast) {
        Compas.northEast = northEast;
    }

    public static String getNorthWest() {
        return northWest;
    }

    public void setNorthWest(String northWest) {
        Compas.northWest = northWest;
    }

    public static String getSouthEast() {
        return southEast;
    }

    public void setSouthEast(String southEast) {
        Compas.southEast = southEast;
    }

    public static String getSouthWest() {
        return southWest;
    }

    public void setSouthWest(String southWest) {
        Compas.southWest = southWest;
    }

    public static String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        Compas.north = north;
    }

    public static String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        Compas.south = south;
    }

    public static String getEast() {
        return east;
    }

    public void setEast(String east) {
        Compas.east = east;
    }

    public static String getWest() {
        return west;
    }

    public void setWest(String west) {
        Compas.west = west;
    }
}
