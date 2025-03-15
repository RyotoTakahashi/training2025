package jp.co.aforce.r.takahashi;
import jp.co.aforce.r.takahashi.human.Japanese;
import jp.co.aforce.r.takahashi.human.American;

import static jp.co.aforce.r.takahashi.human.Japanese.difference;

public class java09 {
    public static void main(String[] args) {
        Japanese taro = new Japanese("太郎");
        Japanese.Japanese_Greetings Jgreetings = new Japanese.Japanese_Greetings();
        Jgreetings.sayGreetings(taro.name);
        taro.birthday = "1990/1/13";
        difference(taro.birthday);

        American john = new American("john");
        American.American_Greedings Egreetings =new American.American_Greedings();
        john.birthday = "1990/12/31";
        Egreetings.sayGreetings(john.name);
        difference(john.birthday);
    }
}
