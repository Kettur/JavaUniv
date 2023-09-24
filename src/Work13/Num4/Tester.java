package Work13.Num4;

public class Tester {
    public static void main(String[] args) {
        String[] masStr = {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L", "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL", "S007,White TShirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};
        Shirt[] masClass = new Shirt[masStr.length];
        for (int i = 0; i < masStr.length; i++) {
            masClass[i] = new Shirt(masStr[i]);
            System.out.println(masClass[i]);
        }
    }
}
