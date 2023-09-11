package Work1.Num4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas2 = new int[3];
        int sum2 = 0;
        int i = 0;
        while (i != mas2.length){
            mas2[i] = sc.nextInt();
            sum2 += mas2[i];
            i++;
        }
        i = 0;
        int max = mas2[0];
        int min = mas2[0];
        while (i != mas2.length){
            if (mas2[i] > max) max = mas2[i];
            if (mas2[i] < min) min = mas2[i];
            i++;
        }
        System.out.println(sum2);
        System.out.println(max);
        System.out.println(min);
    }
}
