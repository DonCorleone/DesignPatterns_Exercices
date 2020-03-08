package com.codewithmosh.state;

/**
 * Demo
 */
public class Demo {

    public static void show() {

        DirectionService service = new DirectionService(new TravelModeWalk());
        System.out.println(service.getDirection());

    }
}