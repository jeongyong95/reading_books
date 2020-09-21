package proxy;

/*
    Proxy Pattern

    제어의 흐름을 조정하기 위한 목적으로 
    중간에 대리자를 두는 패턴
 */
public class ProxyMain {
    public static void main(String[] args) {
        Service service = new ServiceProxy();
        System.out.println(service.runService());
    }
}