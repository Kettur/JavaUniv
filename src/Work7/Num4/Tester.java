package Work7.Num4;

public class Tester {
    public static void main(String[] args) {
        MathFunc m = new MathFunc();
        double re, im;
        re = 5;
        im = 2;
        System.out.println(m.abs(re, im));
        System.out.println(m.Pow(re, 2));
        System.out.println(m.calcLen(5));
    }
}
