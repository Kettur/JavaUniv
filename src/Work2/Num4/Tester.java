package Work2.Num4;

public class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addPC("da");
        shop.addPC("net");
        System.out.println(shop.findPC("da"));
        shop.delPC("net");
        System.out.println(shop.findPC("net"));
        System.out.println(shop.komputers[0]);
    }
}
