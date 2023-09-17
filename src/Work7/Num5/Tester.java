package Work7.Num5;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        StringWork str = new StringWork();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(str.countCh(string));
        str.strOut(string);
        System.out.println(str.reverse(string));
    }
}
