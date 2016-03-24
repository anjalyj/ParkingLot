import java.util.ArrayList;

public class ParkingLot {

    private final int capacity;
    private ArrayList<Car> listOfCars = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();
    private int size;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.observers=observers;
    }

    public void addCar(Car car) {
        listOfCars.add(car);
        if(sizeOfParking()<=(0.2*getSize()) || sizeOfParking()>=(0.8*getSize()));
            notifyAllObservers();
    }

    public boolean isFull() {
        return listOfCars.size()==capacity;
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
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
