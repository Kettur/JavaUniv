package Work4_1.Num8;

import Work4_1.Num8.Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    Rectangle(){}
    Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    Rectangle(double width, double length, String color, boolean filled){}
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimetr() {
        return width * length;
    }

    @Override
    public double getArea() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
