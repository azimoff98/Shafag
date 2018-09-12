package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "is_active")
    private Integer isActive;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "phone_number1")
    private String phoneNumber1;


    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "owner_id")
    private Set<Advertisement> adds;




}
