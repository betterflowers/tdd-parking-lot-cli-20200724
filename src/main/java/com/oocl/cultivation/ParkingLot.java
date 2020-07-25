package com.oocl.cultivation;

import java.util.HashMap;

public class ParkingLot {


    private HashMap<String, String> firstParkingLot = new HashMap<>();
    private HashMap<String,String> secondParkingLot = new HashMap<>();

    public HashMap<String, String> getFirstParkingLot() {
        return firstParkingLot;
    }

    public HashMap<String, String> getSecondParkingLot() {
        return secondParkingLot;
    }

    public void setFirstParkingLot(HashMap<String, String> firstParkingLot) {
        this.firstParkingLot = firstParkingLot;
    }

    public void setSecondParkingLot(HashMap<String, String> secondParkingLot) {
        this.secondParkingLot = secondParkingLot;
    }
}
