package _00JavaThread;

/**
 * 6. 线程相互竞争
 * synchronized
 */
public class Bank {
    private String name;
    private int money;

    public Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 存款
    public synchronized void deposit(int m) {
        money += m;
    }

    // 取款
    public synchronized boolean withdraw(int m) {
        if (money >= m) {
            money -= m;
            return true;// 取款成功
        } else {
            return false;// 取款失败
        }

    }

    public String getName() {
        return name;
    }
}

class Main6 {
    public static void main(String[] args) {
        
    }
}