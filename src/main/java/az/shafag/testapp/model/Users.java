package az.shafag.testapp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "shafag_users")
public class Users {



    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "is_active")
    private Integer isActive;

    @Column(name = "password")
    private String password;

    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id", unique = true, nullable = false, updatable = false)
    private Role role;

    @OneToMany(mappedBy = "applier")
    private Set<Advertisement> adds;

    public Users() {
    }

    public Users(String name,
                 String username,
                 String email,
                 Integer isActive,
                 String password,
                 Role role,
                 Set<Advertisement> adds) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.isActive = isActive;
        this.password = password;
        this.role = role;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Advertisement> getAdds() {
        return adds;
    }

    public void setAdds(Set<Advertisement> adds) {
        this.adds = adds;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", adds=" + adds +
                '}';
    }
}
