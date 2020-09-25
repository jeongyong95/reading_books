package forspring.templatecallback;

/*
    Template Callback Pattern

    OCP, DIP 원칙 적용
    전략 패턴을 익명 내부 클래스로 구현한 패턴
 */
public class TemplateCallbackMain {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("총을 사용합니다.");
        System.out.println();

        rambo.runContext("검을 사용합니다.");
        System.out.println();

        rambo.runContext("포를 사용합니다.");
        System.out.println();
    }
}