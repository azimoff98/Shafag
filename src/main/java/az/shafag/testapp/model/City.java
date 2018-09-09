package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="cities")
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "label")
    private String label;
    @Column(name = "is_active")
    private Integer isActive;

}
