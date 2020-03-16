package com.codewithmosh.state;

public class DirectionService {
    private TravelBase travelMode;

    public DirectionService(TravelBase travelMode) {
        super();
        this.travelMode = travelMode;
    }
    public Object getEta() {

        return travelMode.getEta();
    }

    public Object getDirection() {

        return travelMode.getDirection();
    }

    public TravelBase getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelBase travelMode) {
        this.travelMode = travelMode;
    }
}
