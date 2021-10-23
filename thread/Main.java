package thread;

/**
 * Thread 학습
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("메인 스레드 시작!");
        Runnable runnable = new RunnableTarget();
        Thread threadWithRunnable = new Thread(runnable);
        PrimeThread thread = new PrimeThread();
        thread.start();
        threadWithRunnable.start();
        System.out.println("메인 스레드 종료!");
    }

}

class PrimeThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("새로운 스레드!");
        }
    }
}

class RunnableTarget implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("러너블로 구현한 스레드!");
        }
    }
}