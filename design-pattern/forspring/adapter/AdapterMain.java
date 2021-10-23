package forspring.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        // 어댑터 적용 전
        // ServiceA servA = new ServiceA();
        // ServiceB servB = new ServiceB();

        // servA.runServiceA();
        // servB.runServiceB();

        // 어댑터 적용 후
        AdapterA servA = new AdapterA();
        AdapterB servB = new AdapterB();

        servA.runService();
        servB.runService();
    }

}