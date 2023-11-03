package com.community.board.service;


import com.community.board.entity.Review;
import com.community.board.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReviewService {
@Autowired
    private ReviewRepository reviewRepository;

    public void write(Review review){
        reviewRepository.save(review);
    }

    public List<Review> reviewList(){
        return reviewRepository.findAll();
    }

}
