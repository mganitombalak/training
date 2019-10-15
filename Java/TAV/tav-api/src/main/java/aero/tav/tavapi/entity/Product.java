package aero.tav.tavapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 128, nullable = false)
    private String name;
    private double price;
    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "FK_Product_Category"))
    private Category category;
}
