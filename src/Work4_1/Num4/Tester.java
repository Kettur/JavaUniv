package Work4_1.Num4;

public class Tester {
    public static void main(String[] args) {
        Work4_1.Num4.Matrix m1 = new Work4_1.Num4.Matrix(2,2);
        Work4_1.Num4.Matrix m2 = new Work4_1.Num4.Matrix(2, 2);
        m1.fillM();
        m2.fillM();
        m1.addM(m2);
        m1.printM();
        m1.multMonN(2);
        m1.printM();
        m1.multMonM(m2);
        m1.printM();
    }
}
