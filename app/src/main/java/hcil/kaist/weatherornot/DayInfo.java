package hcil.kaist.weatherornot;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by PCPC on 2016-03-16.
 */
public class DayInfo{
    private int day, month, year;
    private int hour;
    private String whole;

    public DayInfo(){
        day = -1;
        month = -1;
        year = -1;
        hour = -1;
        whole = "";
    }

    public void update(){
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat temp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        whole = temp.format(date);
    }

    public String toString(){
        return whole;
    }


}
