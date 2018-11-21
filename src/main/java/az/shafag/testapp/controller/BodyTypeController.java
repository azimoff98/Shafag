package az.shafag.testapp.controller;


import az.shafag.testapp.dto.BodyTypeDTO;
import az.shafag.testapp.model.BodyType;
import az.shafag.testapp.service.BodyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/body-type")
public class BodyTypeController {


    @Autowired
    private BodyTypeService bodyTypeService;

    @PostMapping
    public void save(@RequestBody BodyType bodyType){
        bodyTypeService.save(bodyType);
    }

    @GetMapping("/all")
    public Set<BodyTypeDTO> getAll(){
        return bodyTypeService.getAll();
    }

    @GetMapping("/{id}")
    public BodyTypeDTO getById(@PathVariable Long id){
        System.out.println("~~~~~~~~~~~~~" + id + "~~~~~~~~~~~~~");
        return bodyTypeService.getById(id);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        bodyTypeService.delete(id);
    }

}
