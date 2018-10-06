package az.shafag.testapp.dto;

import java.util.Date;

public class AdvertisementDTO {

    private Long id;
    private Date date;
    private String description;
    private Integer isActive;
    private String key;
    private String label;
    private Date lastUpdate;
    private Double price;
    private Integer seenCount;
    private Short status;
    private CityDTO cityDTO;
    private CurrencyDTO currencyDTO;
    //Applier
    private UserDTO userDTO;
    private VehicleDTO vehicleDTO;

    public AdvertisementDTO() {
    }

    public AdvertisementDTO(Long id,
                            Date date,
                            String description,
                            Integer isActive,
                            String key,
                            String label,
                            Date lastUpdate,
                            Double price,
                            Integer seenCount,
                            Short status,
                            CityDTO cityDTO,
                            CurrencyDTO currencyDTO,
                            UserDTO userDTO,
                            VehicleDTO vehicleDTO) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.isActive = isActive;
        this.key = key;
        this.label = label;
        this.lastUpdate = lastUpdate;
        this.price = price;
        this.seenCount = seenCount;
        this.status = status;
        this.cityDTO = cityDTO;
        this.currencyDTO = currencyDTO;
        this.userDTO = userDTO;
        this.vehicleDTO = vehicleDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(Integer seenCount) {
        this.seenCount = seenCount;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public CityDTO getCityDTO() {
        return cityDTO;
    }

    public void setCityDTO(CityDTO cityDTO) {
        this.cityDTO = cityDTO;
    }

    public CurrencyDTO getCurrencyDTO() {
        return currencyDTO;
    }

    public void setCurrencyDTO(CurrencyDTO currencyDTO) {
        this.currencyDTO = currencyDTO;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public VehicleDTO getVehicleDTO() {
        return vehicleDTO;
    }

    public void setVehicleDTO(VehicleDTO vehicleDTO) {
        this.vehicleDTO = vehicleDTO;
    }
}
