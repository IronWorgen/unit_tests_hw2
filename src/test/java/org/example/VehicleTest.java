package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car= new Car("VW", "123", 10);
        motorcycle = new Motorcycle("Yamaha", "123", 5);
    }

    @AfterEach
    void tearDown() {
        car=null;
        motorcycle=null;
    }

    @Test
    @DisplayName("Car parent check")
    void carInstanceCheck(){
        assertEquals(true, car instanceof Vehicle);
    }
    @Test
    @DisplayName("check number of wheels")
    void numWheelsCheck(){
        assertEquals(4, car.getNumWheels());
        assertEquals(2, motorcycle.getNumWheels());
    }
    @Test
    @DisplayName("test drive speed check")
    void testDriveSpeed(){
        car.testDrive();
        assertEquals(60, car.getSpeed());

        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    @DisplayName("vehicle parking speed test")
    void  parkingSpeedCheck(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());

        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }


}