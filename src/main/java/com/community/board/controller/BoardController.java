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

    @Autowired
    public BoardController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

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
    public String ReviewList(Model model){
        model.addAttribute("list", reviewService.reviewList());
        return "blog";
    }


    @GetMapping("/write.html")
    public String writePost(){

        return "write";
    }

    @GetMapping("/forum/post")
    public String forumView(Model model, Integer id){

        model.addAttribute("board",boardService.boardView(id));
        return "post";
    }



    @PostMapping("/writeact")
    public String boardWriteAct(Board board){
        boardService.write(board);


        return "writeact";
    }





}
