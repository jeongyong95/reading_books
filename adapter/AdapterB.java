package adapter;

public class AdapterB {
    ServiceB servB = new ServiceB();

    void runService() {
        servB.runServiceB();
    }
}
