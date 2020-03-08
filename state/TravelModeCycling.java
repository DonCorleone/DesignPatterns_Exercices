package com.codewithmosh.state;

/**
 * TravelModeCycling
 */
public class TravelModeCycling implements TravelBase{

    @Override
    public Object getEta(){

        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }
    @Override
    public Object getDirection(){

        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}