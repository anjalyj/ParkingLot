import java.util.HashMap;

public class Manager implements Observer {

    @Override
    public HashMap<ParkingLot, Integer> update() {
//        return null;
        return null;
    }
    public boolean isTraineeAssignable(ParkingLot parkingLot){
        return parkingLot.sizeOfParking()<=(0.8*parkingLot.getSize());
    }
}

