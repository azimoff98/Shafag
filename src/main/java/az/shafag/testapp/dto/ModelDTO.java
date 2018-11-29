package az.shafag.testapp.dto;

public class ModelDTO {

    private Long id;
    private Integer isActive;
    private String label;
    private String name;
    private Long brand_id;

    public ModelDTO() {
    }

    public ModelDTO(Long id, Integer isActive, String label, String name, Long brand_id) {
        this.id = id;
        this.isActive = isActive;
        this.label = label;
        this.name = name;
        this.brand_id = brand_id;
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

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }
}
