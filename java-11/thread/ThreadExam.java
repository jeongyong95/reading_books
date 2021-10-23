package thread;

public class ThreadExam {
    public static void main(String[] args) {
        Food food = new Food();
        Phone phone = new Phone();

        food.start();
        phone.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("스레드 학습하기 : " + i);
        }
    }
}

class Food extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("음식 먹기 : " + i);
        }
    }
}

class Phone extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("전화 받기 : " + i);
        }
    }
}