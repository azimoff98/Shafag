package az.shafag.testapp.dto;

public class ColorDTO {

    private Long id;
    private String label;
    private String name;

    public ColorDTO() {
    }

    public ColorDTO(Long id, String label, String name) {
        this.id = id;
        this.label = label;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
