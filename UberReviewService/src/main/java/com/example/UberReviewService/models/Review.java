package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="booking_Review")
public class Review extends BaseModel{

    @Column(nullable = false)
    String content;

    private Double rating;


}
