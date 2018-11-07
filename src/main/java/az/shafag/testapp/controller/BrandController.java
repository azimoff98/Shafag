package az.shafag.testapp.controller;

import az.shafag.testapp.dto.BrandDTO;
import az.shafag.testapp.model.Brand;
import az.shafag.testapp.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;


    @GetMapping
    public Set<BrandDTO> getAll(){
       return brandService.getAll();
    }

    @GetMapping("/{id}")
    public BrandDTO getById(@PathVariable Long id){
        return brandService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Brand brand){
        brandService.save(brand);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        brandService.delete(id);
    }


}
