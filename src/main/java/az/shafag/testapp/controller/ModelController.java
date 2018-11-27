package az.shafag.testapp.controller;

import az.shafag.testapp.dto.ModelDTO;
import az.shafag.testapp.model.Model;
import az.shafag.testapp.service.ModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/models")
public class ModelController {

    private static final Logger log = LoggerFactory.getLogger(ModelController.class);


    @Autowired
    private ModelService modelService;

    @PostMapping
    public void save(@RequestBody  Model model){
        log.info("~~~~~~~~~~Entry point: " + model.toString());
        modelService.save(model);
    }

    @GetMapping
    public Set<ModelDTO> getAll(){
      return  modelService.getAll();
    }

    @GetMapping("/{id}")
    public ModelDTO getById(@PathVariable Long id){
        return modelService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        modelService.delete(id);
    }


}
