public class Circle extends Shape {
    protected double radius;
    public Circle(int radius){}
    public Circle(double radius, String color, boolean filled){}
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
