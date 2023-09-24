package Work11.Num3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(str);
        Student st = new Student();
        st.setBirth(date);
        String strFormat = sc.next();
        st.outDate(strFormat);
    }
}
