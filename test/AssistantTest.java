//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.*;
//
//public class AssistantTest {
//    @org.junit.Test
//    public void should_be_able_to_add_a_car_in_parking_lot() {
//        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
//        ParkingLot parkingLotOne = new ParkingLot(1, observers);
//        ParkingLot parkingLotTwo = new ParkingLot(2, observers);
//        parkingLots.add(parkingLotOne);
//        parkingLots.add(parkingLotTwo);
//
//        Assistant assistant = new Assistant(parkingLots);
//        Car car = new Car();
//
//        assertTrue(assistant.parkCar(car));
//    }
//    @Test
//    public void should_not_be_able_to_add_car_when_parking_lot_has_no_spcae(){
//        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
//        ParkingLot parkingLotOne = new ParkingLot(1, observers);
//        parkingLots.add(parkingLotOne);
//
//        Assistant assistant = new Assistant(parkingLots);
//        Car carOne = new Car();
//        Car carTwo = new Car();
//        assistant.parkCar(carOne);
//
//        assertFalse(assistant.parkCar(carTwo));
//    }
//    @Test
//    public void should_be_able_to_know_when_the_parking_lot_is_full() {
//        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
//        ParkingLot parkingLotOne = new ParkingLot(1, observers);
//        parkingLots.add(parkingLotOne);
//
//        Assistant assistant = new Assistant(parkingLots);
//        Car carOne = new Car();
//        assistant.parkCar(carOne);
//        assertTrue(assistant.isParkingFull(parkingLotOne));
//    }
//
//    @Test
//    public void should_be_able_to_know_when_the_parking_lot_is_not_full() {
//        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
//        ParkingLot parkingLotOne = new ParkingLot(2, observers);
//        parkingLots.add(parkingLotOne);
//
//        Assistant assistant = new Assistant(parkingLots);
//        Car carOne = new Car();
//        assistant.parkCar(carOne);
//
//        assertFalse(assistant.isParkingFull(parkingLotOne));
//    }
//
//    @Test
//    public void should_be_able_to_handle_multiple_parking_lots(){
//        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
//        ParkingLot parkingLotOne = new ParkingLot(1, observers);
//        ParkingLot parkingLotTwo = new ParkingLot(2, observers);
//        parkingLots.add(parkingLotOne);
//        parkingLots.add(parkingLotTwo);
//
//        Assistant assistant = new Assistant(parkingLots);
//        Car carOne = new Car();
//        assistant.parkCar(carOne);
//
//        assertTrue(assistant.isParkingFull(parkingLotOne));
//    }
//
//
//}