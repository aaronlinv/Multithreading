package _00JavaThread;

/**
 * 2. 启动线程：Thread类的子类
 */
public class PrintThread extends Thread {
    private String message;

    public PrintThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(message);
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
    }
}
