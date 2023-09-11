package Work2.Num10;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        howMany();
    }
    public static void howMany(){
        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        int c = 0;
        for (int i = 0; i < a.length();i++){
            if (a.toCharArray()[i] == ' '){
                c++;
            }
        }
        System.out.println(c+1);
    }
}
