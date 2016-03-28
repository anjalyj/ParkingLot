import com.tw.ParkingLot;
import com.tw.observers.Assistant;
import com.tw.observers.ParkinglotFullException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AssistantTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @org.junit.Test
    public void should_be_able_to_add_a_car_in_parking_lot() throws ParkinglotFullException {
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLotOne = new ParkingLot(1);
        ParkingLot parkingLotTwo = new ParkingLot(2);
        parkingLots.add(parkingLotOne);
        parkingLots.add(parkingLotTwo);

        Assistant assistant = new Assistant(parkingLots);
        Object car = new Object();

        assertTrue(assistant.parkCar(car));
    }
    @Test
    public void should_not_be_able_to_add_car_when_parking_lot_has_no_spcae() throws ParkinglotFullException {
        ArrayList<com.tw.ParkingLot> parkingLots = new ArrayList<>();
        com.tw.ParkingLot parkingLotOne = new com.tw.ParkingLot(1);
        parkingLots.add(parkingLotOne);

        Assistant assistant = new Assistant(parkingLots);
        Object carOne = new Object();
        Object carTwo = new Object();
        assistant.parkCar(carOne);

        thrown.expect(ParkinglotFullException.class);
        thrown.expectMessage("Exceeded maximum capacity");

        assistant.parkCar(carTwo);
    }
    @Test
    public void should_be_able_to_know_when_the_parking_lot_is_full() throws ParkinglotFullException {
        ArrayList<com.tw.ParkingLot> parkingLots = new ArrayList<>();
        com.tw.ParkingLot parkingLotOne = new com.tw.ParkingLot(1);
        parkingLots.add(parkingLotOne);

        Assistant assistant = new Assistant(parkingLots);
        Object carOne = new Object();
        assistant.parkCar(carOne);
        assertTrue(assistant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_know_when_the_parking_lot_is_not_full() throws ParkinglotFullException {
        ArrayList<com.tw.ParkingLot> parkingLots = new ArrayList<>();
        com.tw.ParkingLot parkingLotOne = new com.tw.ParkingLot(2);
        parkingLots.add(parkingLotOne);

        Assistant assistant = new Assistant(parkingLots);
        Object carOne = new Object();
        assistant.parkCar(carOne);

        assertFalse(assistant.isParkingFull(parkingLotOne));
    }

    @Test
    public void should_be_able_to_handle_multiple_parking_lots() throws ParkinglotFullException {
        ArrayList<com.tw.ParkingLot> parkingLots = new ArrayList<>();
        com.tw.ParkingLot parkingLotOne = new com.tw.ParkingLot(1);
        com.tw.ParkingLot parkingLotTwo = new com.tw.ParkingLot(2);
        parkingLots.add(parkingLotOne);
        parkingLots.add(parkingLotTwo);

        Assistant assistant = new Assistant(parkingLots);
        Object carOne = new Object();
        assistant.parkCar(carOne);

        assertTrue(assistant.isParkingFull(parkingLotOne));
    }


}