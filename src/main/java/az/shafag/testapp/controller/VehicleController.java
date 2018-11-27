package az.shafag.testapp.controller;

import az.shafag.testapp.dto.VehicleDTO;
import az.shafag.testapp.model.Vehicle;
import az.shafag.testapp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {


    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public void save(@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
    }

    @GetMapping
    public Set<VehicleDTO> getAll(){
       return vehicleService.getAll();
    }

    @GetMapping("/{id}")
    public VehicleDTO getById(@PathVariable Long id){
       return vehicleService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        vehicleService.delete(id);
    }

}
