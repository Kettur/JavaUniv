package Work13.Num5;

public class PhoneNum {
    public static String split(String num){
        StringBuilder strOut = new StringBuilder();
        if (num.toCharArray()[0] == '+'){
            strOut.append(num, 0, num.length() - 10);
        }
        else {
            strOut.append("+7");
            strOut.append(num, 1, num.length() - 10);
        }
        strOut.append(num, num.length() - 10, num.length() - 7);
        strOut.append("-");
        strOut.append(num, num.length() - 7, num.length() - 4);
        strOut.append("-");
        strOut.append(num, num.length() - 4, num.length());
        return strOut.toString();
    }
}
