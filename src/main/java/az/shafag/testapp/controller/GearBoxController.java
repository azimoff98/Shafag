package az.shafag.testapp.controller;

import az.shafag.testapp.dto.GearBoxDTO;
import az.shafag.testapp.model.GearBox;
import az.shafag.testapp.service.GearBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/gearboxes")
public class GearBoxController {

    @Autowired
    private GearBoxService gearBoxService;


    @PostMapping
    public void save(@RequestBody  GearBox gearBox){
        gearBoxService.save(gearBox);
    }

    @GetMapping
    public Set<GearBoxDTO> getAll(){
        return gearBoxService.getAll();
    }

    @GetMapping("/{id}")
    public GearBoxDTO getById(@PathVariable Long id ){
        return gearBoxService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        gearBoxService.delete(id);
    }

}
