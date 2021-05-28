#   JVM의 Heap Area

##  개요
- JVM의 `Runtime Data Areas`에서 `Heap`은 객체를 저장합니다.
- 객체에 대한 참조 변수는 `Stack`에 있습니다.

##  Oracle의 Hotspot VM의 Heap 구조
- `Young Generation`
  - `Eden`
    - 객체가 최초로 할당되는 장소
    - Eden이 포화상태이면 참조중인 모든 객체를 Survior로 옮깁니다.
    - Survivor로 참조중인 객체가 모두 옮겨지면 Garbage Collection(`Minor GC`) 수행합니다.
  - `Survivor`
    - `Survivor 1`, `Survivor 2`로 이뤄져 있습니다.
    - 참조중인 객체들은 하나의 Survivor 영역만 사용합니다.
- `Old Generation`
  - `Survivor` 에서 오랫동안 참조되고 있는 객체는 `Tenured`로 이동합니다.
  - `Tenured`에 온 객체는 앞으로도 오랫동안 참조될 가능성이 높기 때문에 메모리 상에서 계속 머무릅니다.
  - `Tenured` 의 메모리가 포화상태에 이르면 참조하고 있지 않는 객체에 대한 Garbage Collection(`Major GC` == `Full GC`)이 이뤄집니다.
- `Metaspace`