package com.food.foodapi.domain.model;

import com.food.foodapi.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "food_review")
public class FoodReview extends BaseEntity {
    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "contents", length = 100)
    private String contents;

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

    @Column(name = "zip_code", length = 5)
    private String zipCode;

}
