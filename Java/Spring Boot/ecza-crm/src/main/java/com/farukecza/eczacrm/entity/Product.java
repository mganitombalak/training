package com.farukecza.eczacrm.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    private int producerId;
    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id",foreignKey = @ForeignKey(name="FK_CATEGORY_PRODUCT_CATEGORY"))
    private Category category;
    private double price;
}
