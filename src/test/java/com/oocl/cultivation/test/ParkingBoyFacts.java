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

    @Test
    void should_return_two_tickets_when_parkingBoy_parking_given_twoCar(){
        //given
        ParkBoy parkBoy = new ParkBoy();
        String firstUserCar = "firstCar";
        String secondUserCar = "secondCar";

        //when
        String firstTicket = parkBoy.parking(firstUserCar);
        String secondTicket =parkBoy.parking(secondUserCar);

        //then
        assertNotNull(firstTicket,secondTicket);
    }

    @Test
    void should_return_no_car_when_parkingBoy_fetchUp_car_given_wrongTicket(){
        //given
        ParkBoy parkBoy = new ParkBoy();
        

        //when

        //then

    }

}
