package com.oocl.cultivation;

import java.util.HashMap;

public class SmartPartBoy extends ParkBoy{

    protected String smartPartBoyName = "SMART PARKING BOY";

    public SmartPartBoy(String smartPartBoyName) {
        this.smartPartBoyName = smartPartBoyName;
    }

    @Override
    public String parking(String car) {

        if (this.getCapacity()-firstParkingLot.size() > this.getCapacity()-secondParkingLot.size()) {

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
