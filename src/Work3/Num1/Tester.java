package Work3.Num1;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] masR = new double[10];
        double[] masM = new double[10];

        for (int i = 0; i < masR.length;i++){
            masR[i] = rand.nextDouble();
        }
        for (int i = 0; i < masM.length;i++){
            masM[i] = Math.random();
        }
        for (int i = 0; i < 10; i++){
            System.out.println(masR[i]);
        }
        Arrays.sort(masR);
        Arrays.sort(masM);
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(masR[i]);
        }
    }
}
