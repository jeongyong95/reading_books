package decorator;

import proxy.Service;
import proxy.ServiceImpl;

public class Decorator implements Service {
    Service service;

    @Override
    public String runService() {
        service = new ServiceImpl();
        System.out.println("반환 결과에 장식을 더하여 전달");
        return "데코레이터 장식 + " + service.runService();
    }

}
