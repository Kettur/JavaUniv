package Work6.Num10;

import javax.security.sasl.SaslClient;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Tester {
    public enum Marks{
        MSI, DEXP, Intel, Apple
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        String name;
        System.out.println("Добро пожаловать в магазин, выберете действие, которое вы хотели бы выполнить");
        System.out.println("1 - Добавить ПК в ассортимент");
        System.out.println("2 - Удалить ПК из ассортимента");
        System.out.println("3 - Найти ПК по названию");
        System.out.println("0 - Выйти из магазина");
        while (true){
            int choise = sc.nextInt();
            switch (choise){
                case 0: return;
                case 1:
                    System.out.println("Введите кол-во компьтеров которые хотите добавить");
                    int a = sc.nextInt();
                    for (int i = 0; i < a; i++){
                        System.out.println("Введите последовательно название ПК, название процессора ПК,название установленной памяти, название монитора");
                        Computer comp = new Computer(sc.next(), sc.next(), sc.next(), sc.next());
                        System.out.println("Выберете марку ПК");
                        for (Marks marks: Marks.values()){
                            System.out.println(marks);
                        }
                        comp.setMark(sc.next());
                        shop.addPC(comp);
                    }
                    break;
                case 2:
                    System.out.println("Введите название ПК, который хотите удалить из ассортимента");
                    name = sc.next();
                    if (shop.findPC(name) == -1){
                        System.out.println("В ассортименте нет ПК с таким именем");
                    }
                    else {
                        shop.delPC(name);
                        System.out.println("ПК удален из ассортимента");
                    }
                    break;
                case 3:
                    System.out.println("Введите название ПК, который хотите найти в ассортименте");
                    name = sc.next();
                    if (shop.findPC(name) == -1){
                        System.out.println("В ассортименте нет ПК с таким именем");
                    }
                    else {
                        System.out.println("Искомый ПК находится на позиции" + shop.findPC(name));
                    }
                    break;
            }
        }
    }
}
