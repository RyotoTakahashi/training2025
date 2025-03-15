package jp.co.aforce.r.takahashi.human;


public class American extends getAge {
    public American(String name) {
        this.name = name;
    }
    public static class American_Greedings implements Greetings{
        @Override
        public void sayGreetings(String name){
            System.out.println("Hello.");
            System.out.println("My name is "+name+".");
        }
    }
}
