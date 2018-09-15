package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="cities",schema = "shafag")
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "label")
    private String label;
    @Column(name = "is_active")
    private Integer isActive;

    @OneToMany(mappedBy = "city")
    private Set<Advertisement> advertisements;

}
