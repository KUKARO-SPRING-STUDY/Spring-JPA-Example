# JoinColumn과 ManyToOne

---

* @JoinColumn
  * 속성
    * name : 매핑할 외래 키 이름
      * 기본값 : <필드명>_<기본키 컬럼명>
    * referencedColumnName : 외래 키가 참조하는 대상 테이블의 컬럼명
      * 기본값 : 참조하는 테이블의 기본키 컬럼명
    * foreignKey : 외래 키 제약조건을 직접 지정할 수 있다. 이 속성은 테이블을 생성할 때만 사용한다.
  * 설명
    * 안하고 ManyToOne을 사용해도된다.
      * 이 경우 <필드명>_<기본키 컬렴명>을 사용한다.
* @ManyToOne
  * 속성
    * optional : false로 설정하면 연관된 엔티티가 항상 있어야한다.
      * 기본값 : true
    * fetch : 글로벌 페치 전략을 설정한다.
    * cascade : 영속성 전이 기능을 사용한다.
      * 이게 casacade문법을 말하는거 같은데
    * targetEntity : 연관된 엔티티의 타입 정보를 설정한다.
      * 이 기능은 거의 사용하지 않는다고 한다.

---
* 한글 문제 있었는데 해결함
  * Help -> Edit Custom VM Options
    * -Dfile.encoding=UTF-8
    * 위에거 추가함
  * 프로젝트내에 설정 가능한 모든 옵션 UTF-8로 바꿈
  * persistence.xml에 아래와같이변경
    ```xml
    <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:13306/mydb?useUnicode=true&amp;characterEncoding=UTF-8&amp;serverTimezone=UTC"/>
    ```
  * DB내의 기본설정 UTF-8로 변경
