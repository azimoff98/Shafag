package az.shafag.testapp.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "advertisement")
public class Advertisement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "key")
    private String key;

    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    private Currency currency;

    @Column(name = "date")
    private Date date;

    @Column(name = "price")
    private Float price;

    @Column(name = "description")
    private String description;

    @Column(name = "lastUpdate")
    private Date lastUpdate;

    @Column(name = "label")
    private String label;

    @Column(name = "seen_count")
    private Integer seenCount;

    @Column(name = "status")
    private Short status;

    @Column(name = "is_active")
    private Integer isActive;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "applier_id", nullable = false)
    private Users applier;

    public Advertisement() {
    }

    public Advertisement(String key,
                         Users user,
                         Vehicle vehicle,
                         City city,
                         Currency currency,
                         Date date,
                         Float price,
                         String description,
                         Date lastUpdate,
                         String label,
                         Integer seenCount,
                         Short status,
                         Integer isActive,
                         Owner owner,
                         Users applier) {
        this.key = key;
        this.vehicle = vehicle;
        this.city = city;
        this.currency = currency;
        this.date = date;
        this.price = price;
        this.description = description;
        this.lastUpdate = lastUpdate;
        this.label = label;
        this.seenCount = seenCount;
        this.status = status;
        this.isActive = 0;
        this.owner = owner;
        this.applier = applier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(Integer seenCount) {
        this.seenCount = seenCount;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Users getApplier() {
        return applier;
    }

    public void setApplier(Users applier) {
        this.applier = applier;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", vehicle=" + vehicle +
                ", city=" + city +
                ", currency=" + currency +
                ", date=" + date +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", label='" + label + '\'' +
                ", seenCount=" + seenCount +
                ", status=" + status +
                ", isActive=" + isActive +
                ", owner=" + owner +
                ", applier=" + applier +
                '}';
    }
}
