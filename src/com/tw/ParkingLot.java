package com.tw;

import com.tw.observers.Observer;

import java.util.ArrayList;

public class ParkingLot {

    private final int capacity;
    private ArrayList<Object> listOfCars = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public void addCar(Object vehicle) {
        listOfCars.add(vehicle);
        notifyAllObservers();
    }
    public void  addObsever(Observer observer){
        observers.add(observer);
    }

    public boolean isFull() {
        return listOfCars.size()==capacity;
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update(getSize(),sizeOfParking());
        }
    }

    public int sizeOfParking(){
        return listOfCars.size();
    }

    public  int spacesLeft(){
        return capacity - sizeOfParking();
    }

    public int getSize() {
        return capacity;
    }

}
