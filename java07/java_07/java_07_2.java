package java_07;
import java.util.Scanner;

public class java_07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float height = 0;
        float weight = 0;
        boolean Flag = true;
        while (Flag) {
            System.out.println("身長(m)を入力してください.");
            try {
                height = scanner.nextFloat();
                if(height==0){
                    System.out.println("エラー: 0以外を入力してください。");
                    scanner.nextLine();
                }
                else {
                    Flag = false;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("エラー: 数値を入力してください。");
                height = 0;
                scanner.nextLine();
            }
        }
        Flag = true;
        while (Flag) {
            System.out.println("体重(kg)を入力してください.");
            try {
                weight = scanner.nextFloat();
                Flag = false;
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("エラー: 数値を入力してください。");
                weight = 0;
                scanner.nextLine();
            }
        }
        float bmi = weight/height/height;
        String Judge;
        if (bmi<18.5){
            Judge = "やせ";
        }
        else if (bmi<25) {
            Judge = "標準";
        }
        else if (bmi<30) {
            Judge = "肥満";
        }
        else {
            Judge = "高度肥満";
        }
        System.out.println("あなたは「"+Judge+"」です。" );
    }
}
