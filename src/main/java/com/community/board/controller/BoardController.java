package com.community.board.controller;

import com.community.board.entity.Board;
import com.community.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/")
    public String boardMain(){
        return "index";
    }

    @GetMapping("/list")
    public String PostList(Model model){

        model.addAttribute("list",boardService.boardList());
        return "Boardlist";
    }

    @GetMapping("/write")
    public String WritePost(){
        return "BoardWrite";
    }

    @PostMapping("/board/writeact")
    public String boardWriteAct(Board board){
        boardService.write(board);
        return "";
    }


}
