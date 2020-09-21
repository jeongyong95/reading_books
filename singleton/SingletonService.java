package singleton;

/*
    Singleton Pattern 필요조건

    1. 유일한 단일 객체를 참조할 정적 참조 변수가 필요하다.

    2. new를 실행할 수 없도록 생성자에 private를 지정한다.

    3. 유일한 단일 객체를 반환할 수 있는 정적 메서드가 필요하다

 */
public class SingletonService {

    // 정적 참조 변수
    static SingletonService singletonService;

    // private 생성자
    private SingletonService() {
    }

    // 단일 객체 반환 정적 메서드
    public static SingletonService getInstance() {

        if (singletonService == null) {
            singletonService = new SingletonService();
        }

        return singletonService;
    }
}