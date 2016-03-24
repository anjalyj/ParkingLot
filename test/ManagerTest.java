//
//import org.junit.Assert;
//import org.testng.annotations.Test;
//
//public class ManagerTest {
//    @Test
//    public void should_not_assign_a_trainee_when_a_lot_is_80_percent_full() {
//        ParkingLot parkingLotOne = new ParkingLot(1, observers);
//        Manager manager = new Manager();
//        Car carOne = new Car();
//        parkingLotOne.addCar(carOne);
//
//        Assert.assertFalse(manager.isTraineeAssignable(parkingLotOne));
//    }
//    @Test
//    public void should__assign_a_trainee_when_a_lot_is_less_than_80_percent_of_capacity() {
//        ParkingLot parkingLotOne = new ParkingLot(10, observers);
//        Manager manager = new Manager();
//        Car carOne = new Car();
//        parkingLotOne.addCar(carOne);
//
//        Assert.assertTrue(manager.isTraineeAssignable(parkingLotOne));
//    }
//}