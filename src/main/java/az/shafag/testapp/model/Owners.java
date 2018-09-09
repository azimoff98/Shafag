package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "owners")
public class Owners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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





}
