package com.community.board.service;

import com.community.board.entity.Board;
import com.community.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private BoardRepository boardRepository;
    public void write(Board board){
        boardRepository.save(board);
    }

}
