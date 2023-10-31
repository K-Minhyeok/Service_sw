package com.community.board.controller;

import com.community.board.entity.Board;
import com.community.board.entity.Review;
import com.community.board.service.BoardService;
import com.community.board.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;
    private ReviewService reviewService;

    @GetMapping("/")
    public String boardMain(){

        return "index";
    }
//    @GetMapping("index.html")
//    public String boardMain_re(){
//
//        return "index";
//    }

    @GetMapping("/forum.html")
    public String PostList(Model model){

        model.addAttribute("list",boardService.boardList());
        return "forum";
    }





    @GetMapping("/blog.html")
    public String review(Model model){

//        model.addAttribute("list",reviewService.reveiwList());


        return "blog";
    }


    @GetMapping("/write")
    public String writePost(){

        return "write";
    }


    @PostMapping("/writeact")
    public String boardWriteAct(Board board){
        boardService.write(board);


        return "writeact";
    }


}
