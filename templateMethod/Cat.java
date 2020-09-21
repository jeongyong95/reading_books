package templateMethod;

public class Cat extends Animal {

    @Override
    void play() {
        System.out.println("야옹~! 재밌네");
    }

    @Override
    void run() {
        System.err.println("사뿐사뿐~~");
    }

}
