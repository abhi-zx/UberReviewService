package com.example.UberReviewService.services;


import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.ReviewRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
//@EntityListeners(AuditingEntityListener.class)
public class ReviewService implements CommandLineRunner {

private final ReviewRepositories reviewRepositories;

public ReviewService( ReviewRepositories reviewRepositories){
    this.reviewRepositories = reviewRepositories;

}

    @Override
    public void run(String... args) throws Exception {

        System.out.println("***************");
        Review r = Review
                   .builder()
                   .content("Amazing Content")
                   .rating(5.0)
                   .build();
    reviewRepositories.save(r);
    }
}
