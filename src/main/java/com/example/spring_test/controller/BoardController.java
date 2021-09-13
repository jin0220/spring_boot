package com.example.spring_test.controller;

import com.example.spring_test.domain.BoardDto;
import com.example.spring_test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller //해당 클래스를 컨트롤러로 동작하게 함
public class BoardController {

    @Autowired //비즈니스로직을 퍼리하는 서비스 빈을 연결
    private BoardService boardService;

    @RequestMapping("/")
    public ModelAndView openBoardList() throws Exception{
        ModelAndView mv = new ModelAndView("/board/boardList"); //호출된 요청의 결과를 보여줄 뷰를 지정

        List<BoardDto> list = boardService.selectBoardList(); //게시글 목록을 조회
        mv.addObject("list", list); //실행된 비즈니스 로직의 결과 값을 뷰에 저장

        return mv;
    }
}
