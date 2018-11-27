package az.shafag.testapp.controller;

import az.shafag.testapp.dto.CityDTO;
import az.shafag.testapp.model.City;
import az.shafag.testapp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping()
    public void save(@RequestBody  City city){
        cityService.save(city);
    }

    @GetMapping
    public Set<CityDTO> getAll(){
       return cityService.getAll();
    }

    @GetMapping("/{id}")
    public CityDTO getById(@PathVariable  Long id){
        return cityService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        cityService.delete(id);
    }

}
