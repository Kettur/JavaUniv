package Work6.Num11;

import java.util.Scanner;

public class Tester implements Convertable{
    @Override
    public float convertToF(float temp) {
        return temp * 9 / 5 + 32;
    }

    @Override
    public float convertToK(float temp) {
        return temp - 273;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        Tester test = new Tester();
        System.out.println(test.convertToK(temp));
        System.out.println(test.convertToF(temp));
    }
}
