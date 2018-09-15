package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "owners",schema = "shafag")
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


    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "owner")
    private Set<Advertisement> adds;

    public Owner() {
    }

    public Owner(String name, String email, Integer isActive, String phoneNumber, String phoneNumber1, Set<Advertisement> adds) {
        this.name = name;
        this.email = email;
        this.isActive = isActive;
        this.phoneNumber = phoneNumber;
        this.phoneNumber1 = phoneNumber1;
        this.adds = adds;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public Set<Advertisement> getAdds() {
        return adds;
    }

    public void setAdds(Set<Advertisement> adds) {
        this.adds = adds;
    }
}
