package jp.co.aforce.r.takahashi.human;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


class getAge{
    public String name;
    public String birthday;
    interface Greetings {
        void sayGreetings(String name);
    }
    public static void difference(String birthday){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            Date date = format.parse(birthday);
            var diff= System.currentTimeMillis()-date.getTime();
            var year = diff/((long) 24*60*60*365*1000+6*6*6*97*1000);
            System.out.println(year);
        }
        catch(ParseException e) {
            throw new RuntimeException(e);
        }
    }
}