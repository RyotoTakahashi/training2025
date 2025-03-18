package jp.co.aforce.r.takahashi;
import jp.co.aforce.r.takahashi.human.Japanese;
import jp.co.aforce.r.takahashi.human.American;

import static jp.co.aforce.r.takahashi.human.Japanese.difference;

public class java09 {
    public static void main(String[] args) {
        Japanese taro = new Japanese("太郎");
        Japanese.Japanese_Greetings Jgreetings = new Japanese.Japanese_Greetings();
        Jgreetings.sayGreetings(taro.getName());
        taro.setBirthday("1990/1/13");
        difference(taro.getBirthday());

        American john = new American("john");
        American.American_Greetings Egreetings =new American.American_Greetings();
        john.setBirthday("1990/12/31");
        Egreetings.sayGreetings(john.getName());
        difference(john.getBirthday());
    }
}
