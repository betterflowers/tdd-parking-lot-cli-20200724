package com.oocl.cultivation;


import java.util.ArrayList;
import java.util.HashMap;

public class ParkBoy {

    public HashMap<String,String> parkingLot =new HashMap<>();


    public ParkBoy() {
    }

    public String parking(String car){
        parkingLot.put("ticket",car);
        return "ticket";
    }

    public String fetchCar(String ticket) {
        return parkingLot.get(ticket);


    }

//    public String fetchCar(String ticket){
//        return "car";
//
//    }
}
