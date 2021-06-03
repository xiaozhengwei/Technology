package demo1;

public class SynchronizedDemo1 {
    public static void main(String[] args) {
        synchronized (SynchronizedDemo1.class) {
        }
        m();
    }
    public static  synchronized void m(){

    }
}