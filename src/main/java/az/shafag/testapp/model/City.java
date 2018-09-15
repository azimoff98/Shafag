package az.shafag.testapp.model;



import javax.persistence.*;
import java.util.Set;


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


    public City() {
    }

    public City(String name, String label, Integer isActive, Set<Advertisement> advertisements) {
        this.name = name;
        this.label = label;
        this.isActive = isActive;
        this.advertisements = advertisements;
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

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Set<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(Set<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }
}
