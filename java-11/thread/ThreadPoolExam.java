package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExam {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        fixedThreadPool.execute(new Task());
        fixedThreadPool.execute(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("함수형 인터페이스를 구현해서 스레드 작업");
                }
            }
        });

        fixedThreadPool.execute(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("람다식으로 함수형 인터페이스를 구현해서 스레드 작업");
            }
        });

        fixedThreadPool.shutdown();
        cachedThreadPool.shutdownNow();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("스레드 작업");
        }
    }

}