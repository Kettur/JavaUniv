package Work11.Num1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Date date = new Date();
        Date date1 = new Date();
        date1.setTime(1695212875547L);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 20);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, 9);
        cal.setTime(date1);
        System.out.println("Кузора Кирилл, дата получаения задания " + sdf.format(cal.getTime())+ " Дата сдачи " + sdf.format(date));
    }
}