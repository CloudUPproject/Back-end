package ua.lviv.iot.weblab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.weblab.model.Review;
import ua.lviv.iot.weblab.repository.ReviewRepository;

import java.util.List;
@Service
public class ReviewService {

    final private ReviewRepository ReviewRepository;

    @Autowired
    public ReviewService(ReviewRepository ReviewRepository) {
        this.ReviewRepository = ReviewRepository;
    }

    public void createReview(Review review) {
        ReviewRepository.save(review);
    }

    public List<Review> getAll() {
        return (List<Review>) ReviewRepository.findAll();
    }
}
