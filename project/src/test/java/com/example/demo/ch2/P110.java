package com.example.demo.ch2;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.function.Consumer;

public class P110 {

    private void test(Consumer<EntityManager> func) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            func.accept(em);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }


    @Test
    public void testDetached(){
        test(this::testDetachedLogic);
    }

    private void testDetachedLogic(EntityManager em) {
        Member member =new Member();
        member.setId("memberA");
        member.setUserName("회원A");

        em.persist(member);

        em.detach(member);
    }
}
