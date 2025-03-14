package java_07;
import java.util.Scanner;

public class java_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num_1 = 0;
        float num_2 = 0;
        boolean Flag = true;
        while (Flag) {
            System.out.println("1番目の数字を入力してください.");
            try {
                num_1 = scanner.nextFloat();
                Flag = false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("エラー: 数値を入力してください。");
                num_1 = 0;
                scanner.nextLine();
            }
        }
        Flag = true;
        while (Flag) {
            System.out.println("2番目の数字を入力してください.");
            try {
                num_2 = scanner.nextFloat();
                Flag = false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("エラー: 数値を入力してください。");
                num_2 = 0;
                scanner.nextLine();
            }
        }
        float sum = num_1 + num_2;
        float average = sum / 2;
        System.out.println("合計：" + sum);
        System.out.println("平均：" + average);
    }
}
