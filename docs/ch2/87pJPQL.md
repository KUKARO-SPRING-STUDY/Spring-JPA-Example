# JPQL

---

```java
@Slf4j
public class Ch2MainJPQL {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            logic(em);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

    private static void logic(EntityManager em) {
        TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
        List<Member> members = query.getResultList();
        System.out.println(members);
    }
}
```

* jpql은 마치 sql과 흡사하다.
    * 하지만 차이점이 있다.
    * select * from Member 같이 못쓴다.
        * from에서는 alias를 해준다.
        * select 부분에서는 alias를 선언해준다.
    * 대소문자를 가린다.
* jpql은 DB를 조회하는게 아니라 객체를 조회하는 것이다.
    * 물론 데이터는 DB에서 가져오긴 하는데 해당 객체를 가져오는데 필요한 DB를 알아서 조회한다.
