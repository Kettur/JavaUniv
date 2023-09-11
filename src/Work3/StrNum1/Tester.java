package Work3.StrNum1;

import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        Convertor convertor = new Convertor(Locale.CHINA, 12300);
        System.out.println(convertor.convToFR());
        System.out.println(convertor.convToCH());
        convertor.setLocale(Locale.US);
        System.out.println(convertor.convToFR());
    }
}
