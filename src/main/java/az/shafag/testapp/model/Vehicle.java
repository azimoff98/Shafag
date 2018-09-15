package az.shafag.testapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "vehicle",schema = "shafag")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @Column(name = "year")
    private Integer year;

    @Column(name = "millage")
    private Integer millage;

    @ManyToOne
    @JoinColumn(name = "gearbox_id")
    private GearBox gearBox;

    @ManyToOne
    @JoinColumn(name = "differential_id")
    private Differential differential;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @Column(name = "new")
    private Integer isNew;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id")
    private FuelType fuelType;

    @Column(name = "horse_power")
    private Integer horsePower;

    @Column(name = "engine")
    private Float engine;

    @ManyToOne
    @JoinColumn(name = "body_type_id")
    private BodyType bodyType;

    @ManyToMany
    @JoinTable(
            name = "vehicle_specs",
            joinColumns = {@JoinColumn(name = "vehicle_id")},
            inverseJoinColumns = {@JoinColumn(name = "specs_id")}
    )
    private Set<Specification> specifications;



}
