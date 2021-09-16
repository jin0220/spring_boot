package com.example.spring_test.service;

import com.example.spring_test.domain.Board;
import com.example.spring_test.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //해당 클래스는 서비스로 동작
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardRepository boardRepository; //레포지포리 빈 연결

    @Override
    public List<Board> selectBoardList() throws Exception {
        return boardRepository.findAll();
    }

    @Override
    public void insertBoard(Board board) throws Exception {
        boardRepository.insert(board);
    }
}
