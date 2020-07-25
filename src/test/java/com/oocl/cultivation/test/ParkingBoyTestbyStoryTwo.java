package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingBoyTestbyStoryTwo {

    @Test
    void should_return_error_meaasge_when_parkingBoy_fetchUp_car_given_wrong_ticket(){
        //given
        ParkBoy parkBoy = new ParkBoy();
        String  ticketInfo = "userCarTicket";

        //when
        String userCar = parkBoy.fetchCar(ticketInfo);

        //then
        assertEquals("Unrecognized parking ticket",userCar);
    }

    // When the customer does not provide a ticket when fetching a car. The error message should be "Please provide your parking ticket."
    @Test
    void should_return_error_message_when_parkingBoy_fetchUp_car_given_no_ticket(){
        //given
        ParkBoy parkBoy = new ParkBoy();

        //when
        String userCar = parkBoy.fetchCar();

        //then
        assertEquals("Please provide your parking ticket",userCar);
    }

}
