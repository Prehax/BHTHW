package ParkingLot;

import java.util.*;

public class ParkingLot {
    private List<Car> slots;

    public ParkingLot() {
        this.slots = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.slots.add(car);
    }

    public void removeCar(Car car) {
        this.slots.remove(car);
    }

    public void printStatus() {
        System.out.println(slots);
    }


}
