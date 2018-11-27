package az.shafag.testapp.controller;

import az.shafag.testapp.dto.DiferentialDTO;
import az.shafag.testapp.model.Differential;
import az.shafag.testapp.service.DifferentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/differentials")
public class DifferentialController {

    @Autowired
    private DifferentialService differentialService;

    @PostMapping
    public void save(@RequestBody Differential differential){
        differentialService.save(differential);
    }

    @GetMapping
    public Set<DiferentialDTO> getAll(){
        return differentialService.getAll();
    }

    @GetMapping("/{id}")
    public DiferentialDTO getById(@PathVariable Long id){
        return differentialService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        differentialService.delete(id);
    }
}
