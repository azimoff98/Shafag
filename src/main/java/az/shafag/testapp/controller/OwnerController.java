package az.shafag.testapp.controller;

import az.shafag.testapp.dto.AdvertisementDTO;
import az.shafag.testapp.dto.OwnerDTO;
import az.shafag.testapp.model.Advertisement;
import az.shafag.testapp.model.Owner;
import az.shafag.testapp.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;


    @PostMapping
    public void save(@RequestBody  Owner owner){
        ownerService.save(owner);
    }

    @GetMapping("/all")
    public Set<OwnerDTO> getAll(){
        return ownerService.getAll();
    }

    @GetMapping("/allAds")
    public Set<AdvertisementDTO> getAllAdsOfOwner(Owner owner){
        return ownerService.getAllAddsOfOwner(owner);
    }


    @GetMapping("/{id}")
    public OwnerDTO getById(@PathVariable Long id) {
        return ownerService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        ownerService.delete(id);
    }


}
