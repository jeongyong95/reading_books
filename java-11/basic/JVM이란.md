#   JVM(Java Virtual Machine)이란
##  개요
- 자바 프로그램이 실행되는 가상 환경입니다.
- 자바 개발자는 바이트 코드 파일을 배포하는 과정까지만 합니다.
- 사용자가 자바 프로그램을 실행하려면 JVM이 필요합니다.
- JVM은 바이트 코드가 각 OS에서 실행될 수 있도록 기계어로 변환하고 프로그램을 실행합니다.
- JVM을 통해서 플랫폼 독립적인 개발이 가능해집니다.

##  JVM 구조
자바 프로그램은 각 OS에 최적화된 JVM 위에서 실행됩니다.
- `Class Loader`
  - `Loading` : 클래스를 적재
  - `Linking` : 래퍼런스를 연결
  - `Initialization` : static 값 초기화 & 변수 할당
- `Memory`
  - `Stack`
    - 스레드마다 런타임 스택 생성
    - 메소드 호출을 스택 프레임으로 쌓음
    - 스레드가 종료되면 런타임 스택도 사라짐
  - `PC Registers`
    - 스레드마다 현재 실행할 명령어의 위치를 가리키는 포인터 생성
  - `Native Method Stack`
  - `Heap`
    - 공유 자원
    - 객체 저장
  - `Method`
    - 공유 자원
    - 클래스 수준의 정보 저장
- `Execution Engine`
  - `Interpreter`
    - 바이트 코드를 한 줄씩 실행
  - `Just-In-Time Compiler`
    - 인터프리터가 반복되는 코드를 발견하면 해당 코드를 모두 네이티브 코드(기계어)로 바꿈
    - 인터프리터는 이후로 네이티브 코드를 바로 사용
  - `Garbage Collector`
    - 참조되지 않는 객체의 메모리 할당 해제
- `Native Method Interface`
  - 자바에서 C, C++, Assembly로 작성된 함수를 사용할 수 있는 방법 제공
- `Native Method Library`
  - C, C++로 작성된 라이브러리

### Java 프로그램 실행 구조
1. 소스 파일 --> (컴파일) --> 실행 파일(바이트 코드)
2. JVM
   1. `Class loader`
      - 실행에 필요한 모든 class 파일을 찾아서 준비
   2. `Byte code verifier`
      - 클래스 로더가 준비한 파일의 코드가 올바른지 검증(코드 유효성 검증)
   3. `Just-In-Time Compiler`
      - 바이트 코드를 기계어로 변환
      - 파일 전체를 기계어로 한 번에 변환
   4. `Runtime System`
3. OS
4. Hardware

##  참고자료
[더 자바, 코드를 조작하는 다양한 방법, 백기선](https://www.inflearn.com/course/the-java-code-manipulation/dashboard)
[처음 해보는 자바 프로그래밍, 오정임](http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9791186710326&orderClick=LEa&Kc=)