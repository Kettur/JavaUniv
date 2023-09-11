package Work4_1.Num4;

import java.util.Scanner;

public class Matrix {
    Scanner sc = new Scanner(System.in);
    private int mas[][];
    private int i;
    private int j;
    public Matrix(int i, int j){
        this.i = i;
        this.j = j;
        mas = new int[i][j];
    }
    public void fillM(){
        for (int i1 = 0; i1 < i; i1++){
            for (int j1 = 0; j1 < j; j1++) {
                mas[i1][j1] = sc.nextInt();
            }
        }
    }
    public void addM(Matrix matrix){
        for (int i1 = 0; i1 < i; i1++){
            for (int j1 = 0; j1 < j; j1++) {
                this.mas[i1][j1] += matrix.mas[i1][j1];
            }
        }
    }
    public void multMonN(int num){
        for (int i1 = 0; i1 < i; i1++){
            for (int j1 = 0; j1 < j; j1++) {
                this.mas[i1][j1] *= num;
            }
        }
    }
    public void multMonM(Matrix matrix){
        int tempmas[][] = new int[this.i][matrix.j];
        for (int i1 = 0; i1 < this.i; i1++){
            for (int j1 = 0; j1 < matrix.j; j1++) {
                tempmas[i1][j1] = 0;
                for (int c = 0; c < this.j; c++){
                    tempmas[i1][j1] += this.mas[i1][c] * matrix.mas[c][j1];
                }
            }
        }
        this.mas = tempmas;
    }
    public void printM(){
        for (int i1 = 0; i1 < i; i1++){
            for (int j1 = 0; j1 < j; j1++) {
                System.out.print(this.mas[i1][j1] + " ");
            }
            System.out.println();
        }
    }
}
