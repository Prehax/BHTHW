package ParkingLot;

public class Main {
    public static void main(String[] args) {
        ParkingLot p = new ParkingLot();
        Car car1 = new Car("12345");
        Car car2 = new Car("44322");
        Car car3 = new Car("11452");
        Car car4 = new Car("87766");

        p.addCar(car1);
        p.printStatus();
        p.addCar(car2);
        p.addCar(car3);
        p.addCar(car4);
        p.printStatus();
        p.removeCar(car1);
        p.printStatus();
        p.removeCar(car2);
        p.printStatus();
    }
}


/*
[Car{12345}]
[Car{12345}, Car{44322}, Car{11452}, Car{87766}]
[Car{44322}, Car{11452}, Car{87766}]
[Car{11452}, Car{87766}]
 */
