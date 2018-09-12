package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "label")
    private String label;


    @Column(name = "name")
    @OneToOne(optional = false, mappedBy = "role_id")
    private String name;
}
