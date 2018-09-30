package az.shafag.testapp.dto;

public class CityDTO {

    private Long id;
    private Integer isActive;
    private String label;
    private String name;


    public CityDTO() {
    }

    public CityDTO(Long id, Integer isActive, String label, String name) {
        this.id = id;
        this.isActive = isActive;
        this.label = label;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
