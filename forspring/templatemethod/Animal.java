package forspring.templatemethod;

public abstract class Animal {

    // 템플릿 메서드
    public void playWithFriend() {
        System.out.println("귀여워ㅎㅎ 나랑 놀자!");
        play();
        run();
        System.out.println("다음에 또 놀자! 고마워ㅎㅎ");
    }

    // 추상 메서드
    abstract void play();

    // Hook 메서드
    void run() {
        System.out.println("꼬리 살랑살랑~");
    }
}
