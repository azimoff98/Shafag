package az.shafag.testapp.dto;

public class UserDTO {

    private Long id;
    private String email;
    private Integer isActive;
    private String name;
    private String username;
    private String password;


    public UserDTO() {
    }

    public UserDTO(Long id, String email, Integer isActive, String name, String username, String password) {
        this.id = id;
        this.email = email;
        this.isActive = isActive;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
