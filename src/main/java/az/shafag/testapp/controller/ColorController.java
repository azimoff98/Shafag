package az.shafag.testapp.controller;

import az.shafag.testapp.dto.ColorDTO;
import az.shafag.testapp.model.Color;
import az.shafag.testapp.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/colors")
public class ColorController {

    @Autowired
    private ColorService colorService;

    @PostMapping
    public void save(@RequestBody  Color color){
        colorService.save(color);
    }

    @GetMapping
    public Set<ColorDTO> getAll(){
        return colorService.getAll();
    }

    @GetMapping("/{id}")
    public ColorDTO getById(@PathVariable Long id){
        return colorService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        colorService.delete(id);
    }
}
