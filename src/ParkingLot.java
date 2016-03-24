import java.util.ArrayList;

public class ParkingLot {

    private final int capacity;
    private ArrayList<Car> listOfCars = new ArrayList<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public void addCar(Car car) {
        listOfCars.add(car);
    }

    public boolean isFull() {
        return listOfCars.size()==capacity;
    }
}
