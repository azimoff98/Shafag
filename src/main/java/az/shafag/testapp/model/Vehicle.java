package az.shafag.testapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "brand_id")
    private Long brand_id;

    @Column(name = "model_id")
    private Long model_id;

    @Column(name = "year")
    private Integer year;

    @Column(name = "millage")
    private Integer millage;

    @Column(name = "gearbox_id")
    //Todo: Relation
    private Long gearBoxId;

    @Column(name = "color_id")
    //Todo: Relation
    private Long colorId;

    @Column(name = "new")
    //Todo: Relation
    private Integer isNew;

    @Column(name = "fuel_type_id")
    //Todo: Relation
    private Long fuelTypeId;

    @Column(name = "horse_power")
    private Integer horsePower;

    @Column(name = "engine")
    private Float engine;

    @Column(name = "body_type_id")
    //Todo: Relation
    private Long bodyTypeId;




}
