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
        String userTicket = "wrongTicket";

        //when
        String userCar = parkBoy.fetchCar(userTicket);

        //then
        assertEquals("noCar",userCar);
    }

    @Test
    void should_return_no_car_when_parkingBoy_fetchUp_car_given_usedTicket(){
        //given
        ParkBoy parkBoy =new ParkBoy();
        String userCar ="myCar";
        String userTicket =parkBoy.parking(userCar);

        //when
        parkBoy.fetchCar(userTicket);
        String repeatFetchedCar = parkBoy.fetchCar(userTicket);

        //then
        assertEquals("noCar",repeatFetchedCar);
    }

    @Test
    void should_return_no_position_when_parkingBoy_parking_given_more_than_ten_cars(){
        //given
        ParkBoy parkBoy =new ParkBoy();
        String firstUserCar = "firstUserCar";
        String secondUserCar = "secondUserCar";
        String thirdUserCar = "thirdUserCar";
        String fourthUserCar = "fourthUserCar";
        String fifthUserCar = "fifthUserCar";
        String sixthUserCar = "sixthUserCar";
        String seventhUserCar = "seventhUserCar";
        String eighthUserCar = "eighthUserCar";
        String ninthUserCar = "ninthUserCar";
        String tenthUserCar = "tenthUserCar";
        String eleventhUserCar = "eleventhUserCar";

        //when
        parkBoy.parking(firstUserCar);
        parkBoy.parking(secondUserCar);
        parkBoy.parking(thirdUserCar);
        parkBoy.parking(fourthUserCar);
        parkBoy.parking(fifthUserCar);
        parkBoy.parking(sixthUserCar);
        parkBoy.parking(seventhUserCar);
        parkBoy.parking(eighthUserCar);
        parkBoy.parking(ninthUserCar);
        String tenUserCarTicket = parkBoy.parking(tenthUserCar);
        String eleventhUserCarTicket = parkBoy.parking(eleventhUserCar);

        //then
        assertEquals("tenthUserCarTicket",tenUserCarTicket);
        assertEquals("can't park",eleventhUserCarTicket);
    }

    @Test
    void should_return_no_car_when_parkingBoy_parking_given_parkedCar(){
        //given
        ParkBoy parkBoy =new ParkBoy();
        String userCar = "firstCar";

        //when
        parkBoy.parking(userCar);
        String reslut =parkBoy.parking(userCar);

        //then
        assertEquals("can't park",reslut);
    }

}
