import com.tw.ParkingLot;
import com.tw.observers.Attendant;
import com.tw.observers.Observer;
import com.tw.observers.ParkinglotFullException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AttendantTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @org.junit.Test
    public void should_be_able_to_add_a_car_in_parking_lot() throws ParkinglotFullException {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        ParkingLot parkingLotTwo = new ParkingLot(2);
        parkingLots.add(parkingLotOne);
        parkingLots.add(parkingLotTwo);

        Attendant attendant = new Attendant(parkingLots);
        Object car = new Object ();

        assertTrue(attendant.parkCar(car));
    }
    @Test
    public void should_be_able_to_know_when_the_parking_lot_is_full() throws ParkinglotFullException {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        Object carOne = new Object  ();
        attendant.parkCar(carOne);
        assertTrue(attendant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_know_when_the_parking_lot_is_not_full() throws ParkinglotFullException {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(2);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        Object carOne = new Object  ();
        attendant.parkCar(carOne);

        assertFalse(attendant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_handle_multiple_parking_lots() throws ParkinglotFullException {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        ParkingLot parkingLotTwo = new ParkingLot(2);
        parkingLots.add(parkingLotOne);
        parkingLots.add(parkingLotTwo);

        Attendant attendant = new Attendant(parkingLots);
        Object carOne = new Object  ();
        attendant.parkCar(carOne);

        assertTrue(attendant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_know_when_lot_is_20_percent_or_less_occupied() throws ParkinglotFullException {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(10);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        parkingLotOne.addObsever(attendant);
        Object carOne = new Object();
        attendant.parkCar(carOne);

        assertTrue(attendant.isPromotable(10,1));
    }

    @Test
    public void should_be_able_to_throw_error_when_a_parkinglot_is_full() throws ParkinglotFullException {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        parkingLots.add(parkingLotOne);

        Attendant attendant = new Attendant(parkingLots);
        parkingLotOne.addObsever(attendant);
        Object carOne = new Object();
        Object carTwo = new Object();
        attendant.parkCar(carOne);
        thrown.expect(ParkinglotFullException.class);
        thrown.expectMessage("Exceeded maximum capacity");
        attendant.parkCar(carTwo);


    }
}