package thread;

public class ThreadSleepAndInterruptExam {
    public static void main(String[] args) {
        PrintThread pt = new PrintThread();
        pt.start();
        pt.interrupt();
    }
}

class PrintThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
                System.err.println("출력 : " + i);
            } catch (InterruptedException e) {
                System.out.println("Interrupt가 발생하여 sleep 상태 종료");
            }
        }
    }
}