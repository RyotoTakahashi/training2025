package java08;
abstract class Phone {
    public String phone_number;
    public String mail_address;
    public void call(){
        System.out.println(phone_number+"から電話をかけます");
    }
    public void mail(){
        System.out.println(mail_address+"からメールを送信します");
    }
}