package az.shafag.testapp.dto;

public class OwnerDTO {

    private Long id;
    private String email;
    private Integer isActive;
    private String name;
    private String phoneNumber;
    private String phoneNumber1;

    public OwnerDTO() {
    }

    public OwnerDTO(Long id, String email, Integer isActive, String name, String phoneNumber, String phoneNumber1) {
        this.id = id;
        this.email = email;
        this.isActive = isActive;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.phoneNumber1 = phoneNumber1;
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
}
