package com.community.board.service;

import com.community.board.entity.Board;
import com.community.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
@Autowired
    private BoardRepository boardRepository;
    public void write(Board board){
        boardRepository.save(board);
    }

    public List<Board> boardList()
    {
        return boardRepository.findAll();
    }

    public Board boardView(Integer id){

        return boardRepository.findById(id).get();
    }

}
