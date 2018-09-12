package az.shafag.testapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gearbox")
public class GearBox {

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
}
