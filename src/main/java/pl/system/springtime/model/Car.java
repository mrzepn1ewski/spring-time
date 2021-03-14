package pl.system.springtime.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    private String model;
    private LocalDateTime created;
}
