package proxy;

public class ServiceProxy implements Service {

    Service service;

    @Override
    public String runService() {
        service = new ServiceImpl();
        System.out.println("프록시가 메서드를 가로챕니다.");
        return service.runService();
    }

}
