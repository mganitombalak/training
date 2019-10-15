package aero.tav.springbootmvc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 128, nullable = false)
    private String name;
    @OneToMany(mappedBy = "producer")
    private List<Product> products;
}
