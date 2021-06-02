package thread;

public class UnsyncErrorExam {
    public static void main(String[] args) {
        Account account = new Account();
        BankThread bank1 = new BankThread(account);
        bank1.setName("은행원1");
        BankThread bank2 = new BankThread(account);
        bank2.setName("은행원2");

        bank1.start();
        bank2.start();
    }
}

class Account {
    private long balance = 10_000l;

    public synchronized void drawMoney(long amount) {
        this.balance -= amount;
    }

    public long getBalance() {
        return balance;
    }
}

class BankThread extends Thread {
    private Account account;

    public BankThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        // 동기화를 통해서 공유 자원에서 발생할 수 있는 에러를 방지할 수 있다
        // 블록 동기화 : synchronized (객체명)
        // synchronized (account) {
        for (int i = 0; i < 10; i++) {
            this.account.drawMoney(100l);
            System.out.println(this.getName() + "잔액 : " + this.account.getBalance());
        }
        // }
    }
}