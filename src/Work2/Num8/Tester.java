package Work2.Num8;

public class Tester {
    public static void main(String[] args) {
        String[] str = {"a", "h", "g", "f", "i"};
        rev(str);
        for (int i = 0; i < str.length;i++){
            System.out.println(str[i]);
        }
    }
    public static void rev(String[] str){
        String temp;
        for (int i = 0; i < str.length / 2;i++){
            temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }
    }
}
