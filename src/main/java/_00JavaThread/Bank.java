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
    // synchronized
    public void deposit(int m) {
        money += m;
    }

    // 取款
    // synchronized
    public boolean withdraw(int m) {
        if (money >= m) {
            money -= m;
            check();
            return true;// 取款成功
        } else {
            return false;// 取款失败
        }

    }

    private void check() {
        if (money < 0) {
            System.out.println("可用余额为负数！ money = " + money);
        }
    }

    public String getName() {
        return name;
    }
}

class ClientThread extends Thread {
    private Bank bank;

    public ClientThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            boolean ok = bank.withdraw(1000);
            if (ok) {
                bank.deposit(1000);
            }
        }
    }
}

class Main6 {
    public static void main(String[] args) {
        Bank bank = new Bank("A Bad Bank", 1000);
        new ClientThread(bank).start();
        new ClientThread(bank).start();

    }
}