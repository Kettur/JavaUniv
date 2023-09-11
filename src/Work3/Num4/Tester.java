package Work3.Num4;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String n;
        while (true){
            n = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < n.length(); i++){
                if (!(Character.isDigit(n.toCharArray()[i]))){
                    flag = true;
                    System.out.println("Введено неверное число, введите снова");
                    break;
                }
            }
            if (!flag){
                break;
            }
        }
        int num = Integer.parseInt(n);
        int[] mas = new int[num];
        int even = 0;
        for (int i = 0; i < num; i++){
            mas[i] = rand.nextInt(num);
            if (mas[i] % 2 == 0){ even++; }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int[] evenMas = new int[even];
        int c = 0;
        for (int i = 0; i < num; i++){
            if (mas[i] % 2 == 0) {
                evenMas[c] = mas[i];
                System.out.print(evenMas[c] + " ");
                c++;
            }
        }
    }
}
