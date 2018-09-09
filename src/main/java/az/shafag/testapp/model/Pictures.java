package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pictures")
public class Pictures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "path")
    private String path;

    @Column(name = "is_active")
    private Integer isActive;

    @ManyToOne
    @Column(name = "vehicle_id")
    private Long vehicleId;

}
