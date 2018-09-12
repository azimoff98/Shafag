package az.shafag.testapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "advertisement")
public class Advertisement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="user_id")
    private Long applier_id;


    private Long vehicle_id;

    @Column(name = "city_id")
    private Long city_id;

    @Column(name = "currency_id")
    private Long currency_id;

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

    @Column(name = "owner_id")
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id", nullable = false)
    private Long owner_id;



}
