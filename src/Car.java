public class Car extends Vehicle {
    {
        speed = 60;
        maxCapacity = 4;
        pricePerPass = 100;
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
