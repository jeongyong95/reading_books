package forspring.templatemethod;

/*
    Template Method Pattern

    상위 클래스의 견본 메서드에서 
    하위 클래스가 오버라이딩한 
    메서드를 호출하는 패턴
 */
public class TemplateMethodMain {
    public static void main(String[] args) {
        Animal nubj = new Dog();
        Animal dalbom = new Cat();

        nubj.playWithFriend();

        System.out.println();
        System.out.println();

        dalbom.playWithFriend();
    }
}