package factoryMethod;

public class Adult implements Human {

    @Override
    public void introduce() {
        System.out.println("저는 성인입니다:)");
    }

    @Override
    public Toy getToy() {
        return new Xbox();
    }

}
