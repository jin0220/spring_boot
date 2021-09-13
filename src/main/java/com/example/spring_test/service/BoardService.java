package com.example.spring_test.service;

import com.example.spring_test.domain.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> selectBoardList() throws Exception;
}
