package com.example.spring_test.service;

import com.example.spring_test.domain.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //해당 클래스는 서비스로 동작
public class BoardServiceImpl implements BoardService{

    @Override
    public List<BoardDto> selectBoardList() throws Exception {
        return null;
    }
}
