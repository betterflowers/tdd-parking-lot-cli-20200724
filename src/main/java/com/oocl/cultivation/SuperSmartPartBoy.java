package com.oocl.cultivation;

import java.util.HashMap;

public class SuperSmartPartBoy {

    ParkingLot parkingLot = new ParkingLot();
    HashMap firstParkingLot = parkingLot.getFirstParkingLot();
    HashMap secondParkingLot = parkingLot.getSecondParkingLot();

    protected String smartPartBoyName = "SUPER SMART PARKING BOY";

    public SuperSmartPartBoy(String smartPartBoyName) {
        this.smartPartBoyName = smartPartBoyName;
    }

    public String parking(String car) {

        if ((10 - firstParkingLot.size()) / 10 > (10 - secondParkingLot.size()) / 10) {

            if (firstParkingLot.containsValue(car) || car == null) {
                return "can't park";
            } else {
                String ticketInfo = car + "_first_parkingLot_ticket";
                firstParkingLot.put(ticketInfo, car);
                return ticketInfo;
            }

        } else {
            String secondParkingLotTicketInfo = car + "_second_parkingLot_ticket";
            secondParkingLot.put(secondParkingLotTicketInfo, car);
            return secondParkingLotTicketInfo;

        }

    }
}
