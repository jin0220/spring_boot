package com.example.spring_test.repository;

import com.example.spring_test.domain.Board;

import java.util.List;

public interface BoardRepository{
    List<Board> findAll();
    void insert(Board board);
}
