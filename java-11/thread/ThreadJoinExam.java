package thread;

public class ThreadJoinExam {
    public static void main(String[] args) throws InterruptedException {
        Call call = new Call();
        call.start();
        // join()을 호출한 스레드가 종료될 때까지 현재 스레드는 대기한다.
        call.join();
        System.out.println(call.isAlive());

        for (int i = 0; i < 10; i++) {
            System.out.println("씻기");
        }
    }
}

class Call extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("통화하기!");
        }
    }
}