package az.shafag.testapp.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @ManyToOne
    @Fetch(FetchMode.JOIN)
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
    private Long isNew;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id")
    private FuelType fuelType;

    @Column(name = "horse_power")
    private Integer horsePower;

    private Integer engine;

    @ManyToOne
    @JoinColumn(name = "body_type_id")
    private BodyType bodyType;

    @ManyToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    @JoinTable(
            name = "vehicle_specs",
            joinColumns = {@JoinColumn(name = "vehicle_id")},
            inverseJoinColumns = {@JoinColumn(name = "specs_id")}
    )
    private Set<Specification> specifications;


    public Vehicle() {
    }

    public Vehicle(Brand brand,
                   Model model,
                   Integer year,
                   Integer millage,
                   GearBox gearBox,
                   Differential differential,
                   Color color,
                   Long isNew,
                   FuelType fuelType,
                   Integer horsePower,
                   Integer engine,
                   BodyType bodyType,
                   Set<Specification> specifications) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.millage = millage;
        this.gearBox = gearBox;
        this.differential = differential;
        this.color = color;
        this.isNew = isNew;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.engine = engine;
        this.bodyType = bodyType;
        this.specifications = specifications;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMillage() {
        return millage;
    }

    public void setMillage(Integer millage) {
        this.millage = millage;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public Differential getDifferential() {
        return differential;
    }

    public void setDifferential(Differential differential) {
        this.differential = differential;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Long getIsNew() {
        return isNew;
    }

    public void setIsNew(Long isNew) {
        this.isNew = isNew;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Set<Specification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Set<Specification> specifications) {
        this.specifications = specifications;
    }
}
