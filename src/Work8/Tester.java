package Work8;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //System.out.println(maxLoop(0));
        triLoop(10, 0, 1);
        numLoop(4);
    }
    public static int maxLoop(int a){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b == 0) return a;
        else {
            if (b > a) return maxLoop(b);
            else return maxLoop(a);
        }
    }
    public static void triLoop(int n, int nn, int k){
        if (nn == n) return;
        System.out.print(k + " ");
        if (nn + 1 == (k * (k + 1) / 2)) triLoop(n, nn+1, k + 1);
        else triLoop(n, nn+1, k);
    }
    public static void numLoop(int n){
        if (n == 0) return;
        numLoop(n-1);
        System.out.print(n);
    }
}
