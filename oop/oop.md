#   Object Oriented Programming

## 개요
- 인간 지향적 프로그래밍

##  OOP의 4대 특성
- `캡슐화` : 정보은닉
  - 접근 제한자
    - `public`, `protected`, `default`, `private`
- `상속` : 재사용 + 확장
  - `is a kind of` 관계
  - 자바는 클래스 간 다중 상속 불가능
  - 자바는 인터페이스를 이용한 다중 상속의 이점을 취했음
- `추상화` : 모델링
  - `구체적인 것`을 분해하여 `관심 영역(애플리케이션)에 있는 특성`만을 가지고 재조합하는 것
- `다형성` : 사용 편의
  - `overriding` : 상하로 쌓임
  - `overloading` : 좌우로 쌓임

##  OOP 설계 5대 원칙

### 결합도와 응집도
- `결합도` : 모듈 간 상호 의존도
- `응집도` : 모듈 내부 요소의 기능적 관련성

### SRP(Single Responsibility Principle) : 단일 책임 원칙
~~~
어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다.
                                                  - 로버트 C. 마틴
~~~

### OCP(Open Closed Principle) : 개방 폐쇄 원칙
~~~
소프트웨어 엔티티는 확장에 대해서는 열려 있어야 하지만, 변경에 대해서는 닫혀 있어야 한다.
                                                  - 로버트 C. 마틴
~~~

### LSP(Liskov Substitution Principle) : 리스코프 치환 원칙
~~~
서브 타입은 언제나 자신의 기반 타입으로 교체할 수 있어야 한다.
                                                  - 로버트 C. 마틴
~~~

### ISP(Interface Segregation Principle) : 인터페이스 분리 원칙
~~~
클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안된다.
                                                  - 로버트 C. 마틴
~~~

### DIP(Dependency Inversion Principle) : 의존 역전 원칙
~~~
고차원 모듈은 저차원 모듈에 의존하면 안된다.
이 두 모듈은 모두 다른 추상화된 것에 의존해야 한다.

추상화된 것은 구체적인 것에 의존하면 안된다.
구체적인 것이 추상화된 것에 의존해야 한다.

자주 변경되는 구현체 클래스에 의존하지 마라.
                                
                                                - 로버트 C. 마틴
~~~
