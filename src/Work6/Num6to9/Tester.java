package Work6.Num6to9;

public class Tester {
    public static void main(String[] args) {
        Printable mas[] = new Printable[2];
        mas[0] = new Book();
        mas[1] = new Shop();
        for (int i = 0; i < mas.length; i++){
            mas[i].Print();
        }
    }
}
