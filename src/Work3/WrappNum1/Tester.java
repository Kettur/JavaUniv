package Work3.WrappNum1;

public class Tester {
    public static void main(String[] args) {
        String str = "123.4";
        Double b = Double.valueOf(str);
        double d = Double.parseDouble(str);
        int i = b.intValue();
        byte by = b.byteValue();
        float f = b.floatValue();
        short sh = b.shortValue();
        long l = b.longValue();
        boolean bo = b.isNaN();
        System.out.println(b);
        String str2 = Double.toString(d);
    }
}
