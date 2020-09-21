package adapter;

public class AdapterA {
    ServiceA servA = new ServiceA();

    void runService() {
        servA.runServiceA();
    }
}
