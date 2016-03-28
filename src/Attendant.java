import java.util.ArrayList;
import java.util.HashMap;

public class Attendant implements Observer{
    private ArrayList<ParkingLot> parkingLots;

    public Attendant(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public boolean isParkingFull(ParkingLot parkingLotOne) {
        return parkingLotOne.isFull();
    }

    public boolean parkCar(Car car){
        for (ParkingLot parkingLot : parkingLots) {
               if(!isParkingFull(parkingLot)){
                 parkingLot.addCar(car);
                   return true;
               }
        }
        return  false;
    }

    public HashMap<ParkingLot, Integer> getParkingLotInformation(){
        HashMap<ParkingLot, Integer> parkingLotsInformation = new HashMap<>();
        for (ParkingLot parkingLot : parkingLots) {
            parkingLotsInformation.put(parkingLot,parkingLot.spacesLeft());
        }
        return parkingLotsInformation;
    }



    public boolean isPromotable(int capacity,int occupiedSize) {
        return occupiedSize<=(0.2*capacity);
    }

    @Override
    public void update(int capacity, int occupiedSize) {
        if(isPromotable(capacity,occupiedSize)) {
            promoteParkingLot();
        }
    }

    private void promoteParkingLot() {
    }
}
