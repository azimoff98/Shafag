package az.shafag.testapp.dto;


import java.util.Set;


public class SearchDTO {



    private IdDTO brand;
    private IdDTO model;
    private IdDTO bodyType;
    private IdDTO city;
    private IdDTO color;
    private IdDTO currency;
    private IdDTO differential;
    private Integer engineVolumeFrom;
    private Integer engineVolumeTo;
    private IdDTO fuelType;
    private IdDTO gearBox;
    private IdDTO owner;
    private IdDTO applier;
    private Set<IdDTO> specs;
    private Integer millageFrom;
    private Integer millageTo;
    private Integer priceFrom;
    private Integer priceTo;
    private Integer yearFrom;
    private Integer yearTo;
    private Integer limit;

    public SearchDTO() {
    }

    public SearchDTO(IdDTO brand,
                     IdDTO model,
                     IdDTO bodyType,
                     IdDTO city,
                     IdDTO color,
                     IdDTO currency,
                     IdDTO differential,
                     Integer engineVolumeFrom,
                     Integer engineVolumeTo,
                     IdDTO fuelType,
                     IdDTO gearBox,
                     IdDTO owner,
                     IdDTO applier,
                     Set<IdDTO> specs,
                     Integer millageFrom,
                     Integer millageTo,
                     Integer priceFrom,
                     Integer priceTo,
                     Integer yearFrom,
                     Integer yearTo,
                     Integer limit) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.city = city;
        this.color = color;
        this.currency = currency;
        this.differential = differential;
        this.engineVolumeFrom = engineVolumeFrom;
        this.engineVolumeTo = engineVolumeTo;
        this.fuelType = fuelType;
        this.gearBox = gearBox;
        this.owner = owner;
        this.applier = applier;
        this.specs = specs;
        this.millageFrom = millageFrom;
        this.millageTo = millageTo;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.yearFrom = yearFrom;
        this.yearTo = yearTo;
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    public IdDTO getBrand() {
        return brand;
    }

    public void setBrand(IdDTO brand) {
        this.brand = brand;
    }

    public IdDTO getModel() {
        return model;
    }

    public void setModel(IdDTO model) {
        this.model = model;
    }

    public IdDTO getBodyType() {
        return bodyType;
    }

    public void setBodyType(IdDTO bodyType) {
        this.bodyType = bodyType;
    }

    public IdDTO getCity() {
        return city;
    }

    public void setCity(IdDTO city) {
        this.city = city;
    }

    public IdDTO getColor() {
        return color;
    }

    public void setColor(IdDTO color) {
        this.color = color;
    }

    public IdDTO getCurrency() {
        return currency;
    }

    public void setCurrency(IdDTO currency) {
        this.currency = currency;
    }

    public IdDTO getDifferential() {
        return differential;
    }

    public void setDifferential(IdDTO differential) {
        this.differential = differential;
    }

    public Integer getEngineVolumeFrom() {
        return engineVolumeFrom;
    }

    public void setEngineVolumeFrom(Integer engineVolumeFrom) {
        this.engineVolumeFrom = engineVolumeFrom;
    }

    public Integer getEngineVolumeTo() {
        return engineVolumeTo;
    }

    public void setEngineVolumeTo(Integer engineVolumeTo) {
        this.engineVolumeTo = engineVolumeTo;
    }

    public IdDTO getFuelType() {
        return fuelType;
    }

    public void setFuelType(IdDTO fuelType) {
        this.fuelType = fuelType;
    }

    public IdDTO getGearBox() {
        return gearBox;
    }

    public void setGearBox(IdDTO gearBox) {
        this.gearBox = gearBox;
    }

    public IdDTO getOwner() {
        return owner;
    }

    public void setOwner(IdDTO owner) {
        this.owner = owner;
    }

    public IdDTO getApplier() {
        return applier;
    }

    public void setApplier(IdDTO applier) {
        this.applier = applier;
    }

    public Set<IdDTO> getSpecs() {
        return specs;
    }

    public void setSpecs(Set<IdDTO> specs) {
        this.specs = specs;
    }

    public Integer getMillageFrom() {
        return millageFrom;
    }

    public void setMillageFrom(Integer millageFrom) {
        this.millageFrom = millageFrom;
    }

    public Integer getMillageTo() {
        return millageTo;
    }

    public void setMillageTo(Integer millageTo) {
        this.millageTo = millageTo;
    }

    public Integer getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Integer priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Integer getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(Integer priceTo) {
        this.priceTo = priceTo;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }
}














