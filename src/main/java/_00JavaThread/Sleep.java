package _00JavaThread;

/**
 * 5. 线程暂停，间隔1s输出一次
 */
public class Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
