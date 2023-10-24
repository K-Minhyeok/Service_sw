package com.community.board.repository;

import com.community.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface BoardRepository extends JpaRepository<Board,Integer> {

}
