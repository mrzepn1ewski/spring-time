package pl.system.springtime.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String name;
}
