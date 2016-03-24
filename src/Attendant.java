import java.util.ArrayList;

public class Attendant {
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
}
