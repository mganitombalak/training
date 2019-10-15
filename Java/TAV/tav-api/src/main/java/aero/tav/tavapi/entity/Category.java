package aero.tav.tavapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 64,nullable = false)
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
