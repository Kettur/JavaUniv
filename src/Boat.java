public class Boat extends Vehicle {
    {
        speed = 80;
        maxCapacity = 100;
        pricePerPass = 5000;
    }

    @Override
    public double countTime(double distance, int pas) {
        if (pas <= maxCapacity) {
            return distance / speed;
        }
        return distance / speed * (2 * ((pas-1) / maxCapacity) + 1);
    }

    @Override
    public double countPrice(double pas) {
        return pricePerPass * pas;
    }
}
