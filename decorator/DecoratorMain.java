package decorator;

import proxy.Service;

/*
    Decorator Pattern

    메서드 호출의 반환값에
    변화를 주기 위해
    중간에 장식자를 두는 패턴

    프록시왕 유사하다
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Service decorator = new Decorator();
        System.out.println(decorator.runService());
    }
}