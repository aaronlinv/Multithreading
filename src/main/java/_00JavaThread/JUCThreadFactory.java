package _00JavaThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 4. 使用JUC的ThreadFactory中的线程创建
 */
public class JUCThreadFactory {
    public static void main(String[] args) {
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("Nice!")).start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Good!");
        }
    }
}
