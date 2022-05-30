package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CompasModel implements Serializable {
    private static final CompasModel instance = new CompasModel();
    private final Map<String, String> model;

    public CompasModel() {
        model = new HashMap<String, String>();
    }

    public static CompasModel getInstance() {
        return instance;
    }

    public void sendDegrees(String diapason, String side) {
        model.put(side, diapason);
    }

    public Map<String, String> getAll() {
        return model;
    }

    public String getSide(double degree) {

        if (0 < degree && degree < 44) {return Compas.getNorth();}
        if (45 < degree && degree < 89) {return Compas.getNorthEast();}
        if (90 < degree && degree < 134) {return Compas.getEast();}
        if (135 < degree && degree < 179) {return Compas.getSouthEast();}
        if (180 < degree && degree < 224) {return Compas.getSouth();}
        if (225 < degree && degree < 269) {return Compas.getSouthWest();}
        if (270 < degree && degree < 314) {return Compas.getWest();}
        if (315 < degree && degree < 359) {return Compas.getNorthWest();}
        else return null;
    }
}
