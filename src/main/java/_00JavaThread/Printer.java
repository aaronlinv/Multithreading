package _00JavaThread;

/**
 * 3. 启动线程：Runnable 将Runnable接口的实例作为参数传递给Thread的构造函数
 */
public class Printer implements Runnable {
    private String message;

    public Printer(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(message);
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(new Printer("Good!")).start();
        }
        new Thread(new Printer("Nice!")).start();
        
    }
}