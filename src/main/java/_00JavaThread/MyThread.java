package _00JavaThread;

/**
 * 1. 多线程
 */
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Nice "+i);
        }   
    }
}
class Main{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Good "+i);
        }

    }
}
