/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        int milk = 1;

        boolean existEgg = false;
        if (existEgg) {
            milk = 6;
        }

        buyMilk(milk);
    }

    static void buyMilk(int quantity) {
        System.out.println("우유 " + quantity + "개 샀어 허니ㅎ");
    }
}