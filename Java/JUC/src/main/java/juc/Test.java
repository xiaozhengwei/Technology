package juc;


public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        Thread thread=new Thread(()->{
                int i=0;
                while(true){
                    System.out.println(i++);
                }
            });
            thread.start();
            thread.interrupt();

    }

}


