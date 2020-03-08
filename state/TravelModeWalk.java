package com.codewithmosh.state;

/**
 * TravelModeWalk
 */
public class TravelModeWalk implements TravelBase {

    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;        
    }
}