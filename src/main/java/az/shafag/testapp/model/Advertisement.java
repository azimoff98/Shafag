package az.shafag.testapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "advertisement", schema = "shafag")
public class Advertisement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    private String key;

    @ManyToOne
    @JoinColumn(name = "applier_id")
    private Users user;

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

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;




}
