package com.codewithmosh.state;

/**
 * TravelModeTransit
 */
public class TravelModeTransit implements TravelBase {

    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}