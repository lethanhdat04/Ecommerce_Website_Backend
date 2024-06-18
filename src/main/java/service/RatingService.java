package service;


import exception.ProductException;
import model.Rating;
import model.User;
import org.springframework.stereotype.Service;
import request.RatingRequest;

import java.util.List;

@Service
public interface RatingService {

    public Rating createRating (RatingRequest req, User user) throws ProductException;

    public List<Rating> getProductRating(Long productId);

}
