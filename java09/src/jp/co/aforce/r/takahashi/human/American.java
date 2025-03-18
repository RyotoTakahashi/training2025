package jp.co.aforce.r.takahashi.human;


public class American extends Human {
    public American(String name) {
        this.setName(name);
    }
    public static class American_Greetings implements Greetings{
        @Override
        public void sayGreetings(String name){
            System.out.println("Hello.");
            System.out.println("My name is "+name+".");
        }
    }
}
