package adapter;

/*
    Adapter Pattern
    
    호출당하는 쪽의 메서드를 
    호출하는 쪽의 코드에 대응하도록 
    중간에 변환기를 통해 호출되는 패턴
 */
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