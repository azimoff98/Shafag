package az.shafag.testapp.dto;

public class EngineDTO {
    private Integer id;
    private String name;
    private String volume;

    public EngineDTO() {
    }

    public EngineDTO(Integer id, String name, String volume) {
        this.id = id;
        this.name = name;
        this.volume = volume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
