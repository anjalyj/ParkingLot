import java.util.ArrayList;
import java.util.HashMap;

public class Assistant extends Attendant implements Observer {

    public Assistant(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    @Override
    public HashMap<ParkingLot, Integer> update() {
//        return getParkingLotInformation();
        return null;
    }
}
