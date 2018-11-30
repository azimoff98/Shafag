package az.shafag.testapp.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "models")
public class Model {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "label")
    private String label;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "model", cascade = CascadeType.REMOVE)
    private Set<Vehicle> vehicles;

    @Column(name = "is_active")
    private Integer isActive;

    public Model() {
    }

    public Model(String name,
                 String label,
                 Brand brand,
                 Set<Vehicle> vehicles,
                 Integer isActive) {
        this.name = name;
        this.label = label;
        this.brand = brand;
        this.vehicles = vehicles;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}
