package Work1.Num3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[4];
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            mas[i] = sc.nextInt();
            sum += mas[i];
        }
        System.out.println(sum);
        System.out.println(sum/mas.length);
    }
}
