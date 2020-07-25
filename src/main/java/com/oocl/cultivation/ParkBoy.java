package com.oocl.cultivation;


import javax.print.DocFlavor;
import java.util.HashMap;

public class ParkBoy {

    public HashMap<String, String> parkingLot = new HashMap<>();
    public HashMap<String,String> secondParkingLot = new HashMap<>();

    public ParkBoy() {
    }

    public String parking(String car) {

        if (parkingLot.size() < 10) {
            if (parkingLot.containsValue(car) || car == null) {
                return "can't park";
            } else {
                String ticketInfo = car + "Ticket";
                parkingLot.put(ticketInfo, car);
                return ticketInfo;
            }

        } else {
            String secondParkingLotTicketInfo = car + "_second_parkingLot_ticket";
            secondParkingLot.put(secondParkingLotTicketInfo,car);
            return secondParkingLotTicketInfo;
        }
    }

    public String fetchCar(String ticket) {
        if (parkingLot.get(ticket) != null) {
            String ticketInfo = parkingLot.get(ticket);
            parkingLot.remove(ticket);
            return ticketInfo;
        } else {
            return "Unrecognized parking ticket";
        }
    }

    public String fetchCar() {
        return "Please provide your parking ticket";
    }

}
