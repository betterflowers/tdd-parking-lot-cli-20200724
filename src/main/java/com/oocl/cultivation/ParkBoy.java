package com.oocl.cultivation;


import javax.print.DocFlavor;
import java.util.HashMap;

public class ParkBoy {

    ParkingLot parkingLot = new ParkingLot();
    HashMap firstParkingLot =parkingLot.getFirstParkingLot();
    HashMap secondParkingLot = parkingLot.getSecondParkingLot();
    private Integer capacity = 10;

    public Integer getCapacity() {
        return capacity;
    }

    public String parking(String car) {

        if (firstParkingLot.size() < capacity) {
            if (firstParkingLot.containsValue(car) || car == null) {
                return "can't park";
            } else {
                String ticketInfo = car + "Ticket";
                firstParkingLot.put(ticketInfo, car);
                return ticketInfo;
            }

        } else {
            String secondParkingLotTicketInfo = car + "_second_parkingLot_ticket";
            secondParkingLot.put(secondParkingLotTicketInfo,car);
            return secondParkingLotTicketInfo;
        }
    }

    public String fetchCar(String ticket) {
        if (firstParkingLot.get(ticket) != null) {
            String ticketInfo = (String)firstParkingLot.get(ticket);
            firstParkingLot.remove(ticket);
            return ticketInfo;
        } if(secondParkingLot.get(ticket) != null){
            String ticketInfo = (String) secondParkingLot.get(ticket);
            secondParkingLot.remove(ticket);
            return ticket;
        }
            return "Unrecognized parking ticket";

    }

    public String fetchCar() {
        return "Please provide your parking ticket";
    }

}
