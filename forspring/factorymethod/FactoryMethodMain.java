package forspring.factorymethod;

/*
    Factory Method Pattern

    오버라이드된 메서드가 
    객체를 반환하는 패턴
 */
public class FactoryMethodMain {
    public static void main(String[] args) {

        // 팩터리 메서드를 보유한 객체 생성
        Human adultJ = new Adult();
        Human babyJ = new Baby();

        // 팩터리 메서드가 반환하는 객체들
        Toy adultJToy = adultJ.getToy();
        Toy adultJToy2 = adultJ.getToy();

        // 팩터리 메서드는 계속해서 새로운 객체를 생성한다.
        // adultJToy와 adultJToy2의 객체는 서로 다르다.
        System.out.println(adultJToy);
        System.out.println(adultJToy2);

        Toy babyJToy = babyJ.getToy();

        // 팩터리 메서드가 반환하는 객체들 사용
        adultJToy.readInfo();
        babyJToy.readInfo();
    }
}