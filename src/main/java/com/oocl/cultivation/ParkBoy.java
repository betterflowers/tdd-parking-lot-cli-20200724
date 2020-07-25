package com.oocl.cultivation;


import javax.print.DocFlavor;
import java.util.HashMap;

public class ParkBoy {

    public HashMap<String,String> parkingLot =new HashMap<>();


    public ParkBoy() {
    }

    public String parking(String car){
        if(parkingLot.size()>=10 || parkingLot.containsValue(car) ){
            return "can't park";
        }else{
            String ticketInfo = car+"Ticket";
            parkingLot.put(ticketInfo,car);
            return ticketInfo;
        }
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
