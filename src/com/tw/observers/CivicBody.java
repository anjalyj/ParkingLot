package com.tw.observers;

public class CivicBody implements Observer {

    @Override
    public void update(int capacity, int occupiedSize) {
        if(isTaxable(capacity,occupiedSize))
            collectTax();
    }

    private void collectTax() {
    }

    public boolean isTaxable(int capacity, int occupiedSize) {
        return occupiedSize>=(0.8*capacity);
    }
}
