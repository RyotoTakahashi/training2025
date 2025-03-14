package java_07;

public class java_07_3 {
    public static void main(String[] args){
        float borrowedMoney = 250000;
        float moneyRatio =  (607f/600);
        float repaymentAmount = 30000;
        int repaymentAmountInt = 30000;
        int repaymentMonth = 0;
        boolean debt = true;
        while (debt){
            repaymentMonth = repaymentMonth+1;
            borrowedMoney = borrowedMoney * moneyRatio;
            if (borrowedMoney > repaymentAmount){
                System.out.println(repaymentMonth+"ヶ月目：返済額="+repaymentAmountInt+"円,残り金額"+borrowedMoney+"円");
                borrowedMoney -= repaymentAmount;
            }
            else {
                System.out.println(repaymentMonth+"ヶ月目：返済額="+borrowedMoney+"円,返済完了");
                debt = false;
            }
        }
    }
}
