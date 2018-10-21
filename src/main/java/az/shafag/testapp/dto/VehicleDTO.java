package az.shafag.testapp.dto;



import java.util.Set;

public class VehicleDTO {

    private Long id;
    private Integer millage;
    private Integer year;
    private Integer engine;
    private Integer horsePower;
    private BrandDTO brand;
    private ModelDTO model;
    private ColorDTO color;
    private Integer isNew;
    private GearBoxDTO gearBox;
    private DiferentialDTO differential;
    private FuelTypeDTO fuelType;
    private BodyTypeDTO bodyType;
    private Set<SpecsDTO> specs;
    private Set<PictureDTO> pictures;

    public VehicleDTO() {

    }

    public VehicleDTO(Long id, Integer millage, Integer year, Integer engine, Integer horsePower, BrandDTO brand, ModelDTO model, ColorDTO color, Integer isNew, GearBoxDTO gearBox, DiferentialDTO differential, FuelTypeDTO fuelType, BodyTypeDTO bodyType, Set<SpecsDTO> specs, Set<PictureDTO> pictures) {
        this.id = id;
        this.millage = millage;
        this.year = year;
        this.engine = engine;
        this.horsePower = horsePower;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isNew = isNew;
        this.gearBox = gearBox;
        this.differential = differential;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
        this.specs = specs;
        this.pictures = pictures;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMillage() {
        return millage;
    }

    public void setMillage(Integer millage) {
        this.millage = millage;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public BrandDTO getBrand() {
        return brand;
    }

    public void setBrand(BrandDTO brand) {
        this.brand = brand;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    public ColorDTO getColor() {
        return color;
    }

    public void setColor(ColorDTO color) {
        this.color = color;
    }

    public GearBoxDTO getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBoxDTO gearBox) {
        this.gearBox = gearBox;
    }

    public DiferentialDTO getDifferential() {
        return differential;
    }

    public void setDifferential(DiferentialDTO differential) {
        this.differential = differential;
    }

    public FuelTypeDTO getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelTypeDTO fuelType) {
        this.fuelType = fuelType;
    }

    public BodyTypeDTO getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyTypeDTO bodyType) {
        this.bodyType = bodyType;
    }

    public Set<SpecsDTO> getSpecs() {
        return specs;
    }

    public void setSpecs(Set<SpecsDTO> specs) {
        this.specs = specs;
    }

    public Set<PictureDTO> getPictures() {
        return pictures;
    }

    public void setPictures(Set<PictureDTO> pictures) {
        this.pictures = pictures;
    }
}
