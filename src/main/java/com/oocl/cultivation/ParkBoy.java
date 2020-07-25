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
        if(parkingLot.get(ticket)!=null){
            String ticketInfo = parkingLot.get(ticket);
            parkingLot.remove(ticket);
            return ticketInfo;
        }else{
            return "noCar";
        }

    }

}
