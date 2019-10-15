package aero.tav.springbootmvc.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 128,nullable = false)
    private String name;
    @ManyToOne(optional = false)
    @JoinColumn(name = "producer_id",foreignKey = @ForeignKey(name="FK_PRODUCER_PRODUCT"))
    private Producer producer;
    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id",foreignKey = @ForeignKey(name="FK_CATEGORY_PRODUCT"))
    private Category category;
    private double price;
}
