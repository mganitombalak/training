package aero.tav;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="Cars")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;

}
