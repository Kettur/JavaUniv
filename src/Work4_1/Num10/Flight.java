package Work4_1.Num10;

import Work4_1.Num10.Vehicle;

public class Flight extends Vehicle {
    {
        speed = 200;
        maxCapacity = 200;
        pricePerPass = 10000;
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
