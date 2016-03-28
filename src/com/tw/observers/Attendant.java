package com.tw.observers;

import com.tw.ParkingLot;

import java.util.ArrayList;

public class Attendant implements Observer {
    private ArrayList<ParkingLot> parkingLots;

    public Attendant(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public boolean isParkingFull(ParkingLot parkingLotOne) {
        return parkingLotOne.isFull();
    }

    public boolean parkCar(Object car) throws ParkinglotFullException {
        for (ParkingLot parkingLot : parkingLots) {
            if (!isParkingFull(parkingLot)) {
                parkingLot.addCar(car);
                return true;
            }
        }
        throw new ParkinglotFullException();
    }

    public boolean isPromotable(int capacity, int occupiedSize) {
        return occupiedSize <= (0.2 * capacity);
    }

    @Override
    public void update(int capacity, int occupiedSize) {
        if (isPromotable(capacity, occupiedSize)) {
            promoteParkingLot();
        }
    }

    private void promoteParkingLot() {
    }
}
