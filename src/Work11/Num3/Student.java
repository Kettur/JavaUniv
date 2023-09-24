package Work11.Num3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public void outDate(String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        System.out.println(sdf.format(getBirth()));
    }
}
