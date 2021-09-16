package com.example.spring_test.repository;

import com.example.spring_test.domain.Board;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JpaBoardRepository implements BoardRepository{

//    @PersistenceContext
//    private final EntityManager em; //jpa를 사용하기 위해서 엔티티 매니저가 필요함
//
//    public JpaBoardRepository(EntityManager em) {
//        this.em = em;
//    }

    @Override
    public List<Board> findAll() {
//        return em.createQuery("select * from board", Board.class).getResultList(); //jpql을 사용하여 데이터 가져옴
        return new ArrayList<>();
    }

    @Override
    public void insert(Board board) {

    }
}
