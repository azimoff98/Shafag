package az.shafag.testapp.dto;

import az.shafag.testapp.model.Brand;
import az.shafag.testapp.model.Picture;

import java.util.Set;

public class VehicleDTO {

    private Integer millegeFrom;
    private Integer millegeTo;
    private Integer yearFrom;
    private Integer yearTo;
    private EngineDTO engineVolumeFrom;
    private EngineDTO engineVolumeTo;
    private BrandDTO brand;
    private ModelDTO model;
    private ColorDTO color;
    private GearBoxDTO gearBox;
    private DiferentialDTO differential;
    private FuelTypeDTO fuelType;
    private BodyTypeDTO bodyType;
    private Set<SpecsDTO> specs;
    private Set<PictureDTO> pictures;

    public Integer getMillegeFrom() {
        return millegeFrom;
    }

    public void setMillegeFrom(Integer millegeFrom) {
        this.millegeFrom = millegeFrom;
    }

    public Integer getMillegeTo() {
        return millegeTo;
    }

    public void setMillegeTo(Integer millegeTo) {
        this.millegeTo = millegeTo;
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

    public EngineDTO getEngineVolumeFrom() {
        return engineVolumeFrom;
    }

    public void setEngineVolumeFrom(EngineDTO engineVolumeFrom) {
        this.engineVolumeFrom = engineVolumeFrom;
    }

    public EngineDTO getEngineVolumeTo() {
        return engineVolumeTo;
    }

    public void setEngineVolumeTo(EngineDTO engineVolumeTo) {
        this.engineVolumeTo = engineVolumeTo;
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
