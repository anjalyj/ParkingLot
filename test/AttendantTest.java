import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AttendantTest {
    ArrayList<Observer> observers = new ArrayList<>();

//    @Before
//    public void setUp() throws Exception {
//        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
//        ParkingLot parkingLotOne = new ParkingLot(1);
//        ParkingLot parkingLotTwo = new ParkingLot(2);
//        parkingLots.add(parkingLotOne);
//        parkingLots.add(parkingLotTwo);
//        observers.add(new Attendant(parkingLots));
//        observers.add(new Manager());
//        observers.add(new Assistant(parkingLots));
//
//    }

    @org.junit.Test
    public void should_be_able_to_add_a_car_in_parking_lot() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        ParkingLot parkingLotTwo = new ParkingLot(2);
        parkingLots.add(parkingLotOne);
        parkingLots.add(parkingLotTwo);

        Attendant attendant = new Attendant(parkingLots);
        Car car = new Car();

        assertTrue(attendant.parkCar(car));
    }
    @Test
    public void should_not_be_able_to_add_car_when_parking_lot_has_no_spcae(){
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        Car carOne = new Car();
        Car carTwo = new Car();
        attendant.parkCar(carOne);

        assertFalse(attendant.parkCar(carTwo));
    }
    @Test
    public void should_be_able_to_know_when_the_parking_lot_is_full() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        Car carOne = new Car();
        attendant.parkCar(carOne);
        assertTrue(attendant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_know_when_the_parking_lot_is_not_full() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(2);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        Car carOne = new Car();
        attendant.parkCar(carOne);

        assertFalse(attendant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_handle_multiple_parking_lots(){
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        ParkingLot parkingLotTwo = new ParkingLot(2);
        parkingLots.add(parkingLotOne);
        parkingLots.add(parkingLotTwo);

        Attendant attendant = new Attendant(parkingLots);
        Car carOne = new Car();
        attendant.parkCar(carOne);

        assertTrue(attendant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_know_when_lot_is_20_percent_or_less_occupied() {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(10);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        parkingLotOne.addObsever(attendant);
        Car carOne = new Car();
        attendant.parkCar(carOne);

        assertTrue(attendant.isPromotable(10,1));


    }
}