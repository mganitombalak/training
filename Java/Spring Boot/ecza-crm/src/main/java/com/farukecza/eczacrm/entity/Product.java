package com.farukecza.eczacrm.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @ManyToOne(optional = false)
    @JoinColumn(name = "producer_id",foreignKey = @ForeignKey(name="FK_PRODUCER_PRODUCT_PRODUCER"))
    private Producer producer;
    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id",foreignKey = @ForeignKey(name="FK_CATEGORY_PRODUCT_CATEGORY"))
    private Category category;
    private double price;
}
