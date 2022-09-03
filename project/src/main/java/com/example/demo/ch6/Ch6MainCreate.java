package com.example.demo.ch6;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ch6MainCreate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook_ch6");
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
        Team team1 = new Team("팀1");
        em.persist(team1);

        Member member1 = new Member( "멤버1");
//        member1.setTeam(team1);
        em.persist(member1);

        Member member2 = new Member( "멤버2");
//        member2.setTeam(team1);
        em.persist(member2);
    }
}
