package Work13.Num2;

public class Tester {
    public static void main(String[] args) {
        Person man1 = new Person("John", "Petrov");
        Person man2 = new Person("Ivanov");
        Person man3 = new Person("Simon", "Sidorov", "Andreevich");
        man3.out();
        man2.out();
        man1.out();
    }
}
