package java08;
public class java08 {
    public static void main(String[] args){
        System.out.println("携帯電話クラス");
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.call();
        mobilePhone.mail();
        System.out.println("スマートフォンクラス");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.playmusic();
        smartPhone.volumeup(6);
        smartPhone.nextmusic();
        smartPhone.volumedown(5);
        smartPhone.stopmusic();
        smartPhone.call();
        smartPhone.mail();
    }
}