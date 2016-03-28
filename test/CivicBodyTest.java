import com.tw.ParkingLot;
import com.tw.observers.CivicBody;
import org.junit.Assert;

public class CivicBodyTest {
    @org.testng.annotations.Test
    public void should_collect_tax_when_a_lot_is_80_percent_full() {
        ParkingLot parkingLotOne = new ParkingLot(1);
        CivicBody civicBody = new CivicBody();
        Object carOne = new Object();
        parkingLotOne.addCar(carOne);

        Assert.assertTrue(civicBody.isTaxable(parkingLotOne.getSize(),parkingLotOne.sizeOfParking()));
    }
    @org.testng.annotations.Test
    public void should_not_collect_tax_when_a_lot_is_less_than_80_percent_of_capacity() {
        ParkingLot parkingLotOne = new ParkingLot(10);
        CivicBody civicBody = new CivicBody();

        Object carOne = new Object();
        parkingLotOne.addCar(carOne);

        Assert.assertFalse(civicBody.isTaxable(parkingLotOne.getSize(),parkingLotOne.sizeOfParking()));
    }
}