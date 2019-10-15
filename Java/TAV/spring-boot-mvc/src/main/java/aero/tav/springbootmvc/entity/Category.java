package aero.tav.springbootmvc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 128,nullable = false)
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
