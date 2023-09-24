package Work13.Num1;

public class Tester {
    public static void main(String[] args) {
        test("I like Java!!!");
    }
    public static void test(String str){
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println("I like Java!!!".indexOf("Java"));
        str = str.replace('a', 'o');
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        System.out.println(str.substring(0, 3));
    }
}
