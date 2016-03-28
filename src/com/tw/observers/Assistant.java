package com.tw.observers;

import com.tw.ParkingLot;

import java.util.ArrayList;

public class Assistant extends Attendant implements Observer {

    public Assistant(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

}
