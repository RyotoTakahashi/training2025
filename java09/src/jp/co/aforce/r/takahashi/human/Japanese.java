package jp.co.aforce.r.takahashi.human;

public class Japanese extends Human {
    public Japanese(String name) {
        this.setName(name);
    }
    public static class Japanese_Greetings implements Greetings{
        @Override
        public void sayGreetings(String name){
            System.out.println("こんにちは！");
            System.out.println("私の名前は"+name+"です！");
        }
    }
}
