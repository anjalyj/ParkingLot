package com.tw.observers;

public class ParkinglotFullException extends Throwable {
    public ParkinglotFullException() {
        super("Exceeded maximum capacity");
    }
}
