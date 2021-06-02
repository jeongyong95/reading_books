package thread;

public class RunnableExam {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Movie());
        t1.setPriority(Thread.MAX_PRIORITY);

        // Runnable은 함수형 인터페이스 --> 람다식으로 구현 가능
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("음악 듣기 :" + i);
            }
        });
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("메인 스레드 실행중");
        }
    }
}

class Movie implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("영화 보기 : " + i);
        }
    }
}