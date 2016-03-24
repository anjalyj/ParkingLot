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

    @Override
    public HashMap<ParkingLot, Integer> update() {
        return getParkingLotInformation();
    }

    public boolean isPromotable(ParkingLot parkingLotOne) {
        return parkingLotOne.sizeOfParking()<=(0.2*parkingLotOne.getSize());
    }

//    @Override
//    public void update() {
//        setPromote();
//    }
//
//    private void setPromote() {
//    }
}
