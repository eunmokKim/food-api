package com.food.foodapi.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food_review")
public class FoodReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "content", length = 100)
    private String content;

    @Column(name = "thumbnail_path", length = 300)
    private String thumbnailPath;

    @Column(name = "shorts_path", length = 300)
    private String shortsPath;

    @Column(name = "region", length = 200)
    private String region;

    @Column(name = "latitude", length = 100)
    private String latitude;

    @Column(name = "longitude", length = 100)
    private String longitude;

    @Column(name = "created_by", length = 20, nullable = false)
    private String createdBy;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "modified_by", length = 20, nullable = false)
    private String modifiedBy;

    @Column(name = "modified_at", nullable = false)
    private LocalDateTime modifiedAt;

}
