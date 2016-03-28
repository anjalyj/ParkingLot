import java.util.ArrayList;
import java.util.HashMap;

public class Assistant extends Attendant implements Observer {

    public Assistant(ArrayList<ParkingLot> parkingLots) {
        super(parkingLots);
    }

}
