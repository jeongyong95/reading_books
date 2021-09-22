#   JPQL

##  JPQL이란
- JPA는 RDB 종류와 관계없이 작업을 처리해야함
  - JPQL(JPA Query Language) 등장
- JPQL은 영속성 컨테이너에서 등록된 엔티티를 조작
- JPQL은 영속성 컨테이너에서 관리 상태인 엔티티를 대상으로 검색
- SQL과 구조와 사용법이 유사함
- 목록 질의 등을 수행하기 위해서 `createQuery(String jpql)` 메서드 사용

##  구조
- `SELECT`
  - 검색하려는 엔티티, 엔티티의 변수 목록
- `FROM`
  - 검색 대상인 엔티티, 엔티티 목록
- `WHERE`
  - 연산자, 함수 등으로 검색 제약 조건 표현
- `GROUP BY`
  - 검색 대상 엔티티를 특정 조건으로 그룹핑
- `HAVING`
  - 그룹핑된 엔티티에 제약조건 표현
- `ORDER`
  - 검색 결과에 대한 정렬 방식

##  JPQL 사용 주의사항
- FROM 절에서는 검색 대상 엔티티의 이름을 기술해야 함
  - `@Entity`의 `name` or `Class의 이름`
- JPQL에서는 SELECT 절이 생략 가능함
  - 생략시 검색 결과로는 엔티티 전체가 표현됨
- 검색 결과를 특정할 수 있다면 `TypedQuery`, 없다면 `Query` 타입으로 받아야 함

##  파라미터 바인딩
- 위치 기반 파라미터 바인딩
```java
String jpql = "select id, name from Employee where id = ?1 and name = ?2";
Query query = entityManager.createQuery(jpql);
query.setParameter(1, 1L);
query.setParameter(2, "emp11");
```

- 이름 기반 파라미터 바인딩
```java
String jpql = "select id, name from Employee where id = :empId and name = :empName";
Query query = entityManager.createQuery(jpql);
query.setParameter("empId", 1L);
query.setParameter("empName", "emp11");
```

##  Join, Group By, Order By

### Join
- JPQL은 연관관계를 기반으로 조인을 수행함
- 묵시적 조인
  - JPQL에 조인 구문이 없지만, 영속성 컨테이너가 내부적으로 처리
  - 영속성 컨테이너는 JPQL로 검색을 수행할 때 연관관계에 있는 객체도 조회함
  - JPQL에 연관 객체가 기술되지 않으면 조인은 `개별적인 select문`으로 처리됨
- 명시적 조인
  - 묵시적 조인은 jqpl에 `inner join`을 기술하면 명시적 조인이 되어 select문이 여러번 처리되는 것을 방지함
- 조인 페치(`Join Fetch`)
  - 묵시적 조인에서는 N+1 문제가 발생함
  - 조인 페치를 적용하면 명시적 조인과 같이 한 번의 조인으로 결과를 가져옴
  - `"select e from Employee e join fetch e.dept"`

### Group By, Having, Order By
- JPQL에서 제공하는 그룹 함수
  - COUNT, MAX, MIN, AVG, SUM
- 데이터가 없는 상태에서 그룹 함수를 실행하면 null이 반환됨
- jpql 예제
```java
String jpql = "select ~ from Employee e join e.dept d group by d.name having avg(e.salary) >= 30000.0 order by e.id asc";
```

##  참고자료
[JPA 퀵스타트, 채규태](http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9791186710586&orderClick=LEA&Kc=)