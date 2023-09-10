public abstract class Vehicle {
    protected double speed;
    protected double pricePerPass;
    protected double maxCapacity;
    public abstract double countTime(double distance, int pas);
    public abstract double countPrice(double pas);
}
