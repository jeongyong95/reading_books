package forspring.factorymethod;

public class Baby implements Human {

    @Override
    public void introduce() {
        System.out.println("저는 아기입니다ㅎㅎㅎ");
    }

    @Override
    public Toy getToy() {
        return new Lego();

    }

}
