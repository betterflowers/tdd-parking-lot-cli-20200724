package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingBoyTestbyStoryTwo {
  //  When the customer gives a wrong ticket (the parking boy does not provide the ticket / the ticket has been used).
    //  Then no car should be fetched. If I query the error message, I can get an "Unrecognized parking ticket.".
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

}
