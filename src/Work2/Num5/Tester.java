package Work2.Num5;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog(12, "da");
        Pitomnik pit = new Pitomnik();
        pit.addDog(dog);
        System.out.println(pit.dogs[0]);
    }
}
