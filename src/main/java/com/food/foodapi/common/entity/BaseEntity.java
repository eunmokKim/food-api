package com.food.foodapi.common.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity extends BaseIdEntity {
    @Column(name = "created_by", length = 20, nullable = false)
    private String createdBy;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "modified_by", length = 20, nullable = false)
    private String modifiedBy;

    @Column(name = "modified_at", nullable = false)
    private LocalDateTime modifiedAt;


    @PrePersist
    public void prePersist(){
        this.createdAt = LocalDateTime.now();
        this.createdBy = "ADMIN";
        this.modifiedAt = LocalDateTime.now();
        this.modifiedBy = "ADMIN";
    }

}
