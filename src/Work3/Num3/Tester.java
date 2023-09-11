package Work3.Num3;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] masI = new int[4];
        int[] masTemp = new int[4];
        for (int i = 0; i < masI.length; i++){
            masI[i] = rand.nextInt(90) + 10;
            masTemp[i] = masI[i];
            System.out.println(masI[i]);
        }
        Arrays.sort(masI);
        if (Arrays.equals(masI, masTemp)){
            System.out.println("Массив - возрастающая последовательность");
        }
    }
}
