package com.example.spring_test.service;

import com.example.spring_test.domain.Board;

import java.util.List;

public interface BoardService {
    List<Board> selectBoardList() throws Exception;

    void insertBoard(Board board) throws Exception;
}
