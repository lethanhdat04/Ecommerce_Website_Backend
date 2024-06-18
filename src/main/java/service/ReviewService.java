package service;

import exception.ProductException;
import model.Review;
import model.User;
import request.ReviewRequest;

import java.util.List;

public interface ReviewService {

    public Review createReview(ReviewRequest req, User user) throws ProductException;

    public List<Review> getAllReview(Long productId);

}
