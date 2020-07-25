package com.oocl.cultivation.test;

import com.oocl.cultivation.ParkBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingBoyTestModify {

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

    // When the parking boy attempt to park a car into a parking lot without a position. The error message should be "Not enough position."
    @Test
    void should_return_error_message_when_parkingBoy_park_car_given_the_eleventh_car(){

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
        assertEquals("Not enough position",eleventhUserCarTicket);

    }

    //there are two parking lots managed by the parking boy. The parking boy will park cars to the second parking lot when the first parking lot is full
    @Test
    void should_return_secone_parkingLot_ticket_when_parkingBoy_park_car_given_more_than_ten_cars(){

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
        assertEquals("eleventhUserCar_second_parkingLot_ticket",eleventhUserCarTicket);

    }

}
