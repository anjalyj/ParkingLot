package com.tw.observers;

public class Manager implements Observer {

    public boolean isTraineeAssignable(int capacity,int occupiedSize){
        return occupiedSize>=(0.8*capacity);
    }

    @Override
    public void update(int capacity, int occupiedSize) {
        if(isTraineeAssignable(capacity,occupiedSize))
            assignTrainee();
    }

    private void assignTrainee() {
    }
}

