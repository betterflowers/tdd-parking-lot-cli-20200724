package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ParkingBoyFacts {
    @Test
    void should_return_ticket_when_parkingBoy_parking_given_oneCar_and_oneParkingBoy() {
        ParkBoy parkBoy = new ParkBoy();

        String userCar = "oneCar";

        String result = parkBoy.parking(userCar);

        assertNotNull(result);

    }

    @Test
    void should_return_originCar_when_parkingBoy_fetchUp_car_given_oneTicket_and_oneParkingBoy(){
        //given
        ParkBoy parkBoy = new ParkBoy();
        String userCar = "oneCar";
        String ticket = parkBoy.parking(userCar);

        //when
        String fetchedCar = parkBoy.fetchCar(ticket);

        //then
        assertEquals(userCar,fetchedCar);

    }

    

}
