package forspring.singleton;

/*
    Singleton Pattern

    클래스의 인스턴스,
    즉 객체를 하나만 만들어 사용하는 패턴

    특징
    1. private 생성자
    2. 단일 객체 참조 변수를 정적 속성으로 가짐
    3. 단일 객체 참조 변수가 참조하는 getInstance() 정적 메서드를 가짐
    4. 단일 객체는 쓰기 가능한 속성을 갖지 않는 것이 정석
 */
public class SingletonMain {
    public static void main(String[] args) {

        // constructor가 private이므로 인스턴스를 생성할 수 없다.
        // SingletonService service = new SingletonService();

        SingletonService serviceA = SingletonService.getInstance();
        SingletonService serviceB = SingletonService.getInstance();
        SingletonService serviceC = SingletonService.getInstance();

        // 참조 변수 자체를 출력하면
        // 객체의 toString() 실행 --> 객체의 고유값(Hashcode)를 반환
        System.out.println(serviceA);
        System.out.println(serviceB);
        System.out.println(serviceC);

        serviceA = null;
        serviceB = null;
        serviceC = null;
    }
}