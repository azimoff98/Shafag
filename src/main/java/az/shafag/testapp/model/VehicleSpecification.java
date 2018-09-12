package az.shafag.testapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vehicle_specs")
public class VehicleSpecification {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "vehicle_id")
    //TODO: Relation
    private Long vehicleId;

    @Column(name = "specs_id")
    //TODO: Relation
    private Long specId;

}
