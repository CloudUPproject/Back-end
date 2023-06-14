package ua.lviv.iot.weblab.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
import ua.lviv.iot.weblab.model.Review; 
import ua.lviv.iot.weblab.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    final private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void createReview (@RequestBody Review review) {
        reviewService.createReview(review);
    }

    @CrossOrigin
    @GetMapping
    public List<Review> getAll() {
        return reviewService.getAll();
    }

}