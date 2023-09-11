package Work4_1.Num10;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Flight flight = new Flight();
        System.out.println(car.countPrice(6));
        System.out.println(boat.countTime(1000, 100));
        System.out.println(flight.countPrice(60) + " " + flight.countTime(8000, 60));
    }
}
