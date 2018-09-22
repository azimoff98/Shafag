package az.shafag.testapp.dto;

import java.util.Set;

public class VehicleDTO {

    private Integer millegeFrom;
    private Integer millegeTo;
    private Integer yearFrom;
    private Integer yearTo;
    private Float engineVolumeFrom;
    private Float engineVolumeTo;
    private IdDTO brand;
    private IdDTO model;
    private IdDTO color;
    private IdDTO gearBox;
    private IdDTO differential;
    private IdDTO fuelType;
    private IdDTO bodyType;
    Set<IdDTO> specs;


}
