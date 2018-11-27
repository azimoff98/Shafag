package az.shafag.testapp.controller;


import az.shafag.testapp.dto.AdvertisementDTO;
import az.shafag.testapp.model.Advertisement;
import az.shafag.testapp.model.wrapper.Matcher;
import az.shafag.testapp.service.AdvertisementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ads")
public class AdvertisementController {

    private final static Logger log = LoggerFactory.getLogger(AdvertisementController.class);


    @Autowired
    private AdvertisementService advertisementService;


    @GetMapping("/all-actives")
    public Set<AdvertisementDTO> getAllActive(){
       return advertisementService.getAllActive();
    }

    @GetMapping
    public Set<AdvertisementDTO> getAll(){
        return advertisementService.getAll();

    }

    @GetMapping("/{id}")
    public AdvertisementDTO getById(@PathVariable  Long id){
        return advertisementService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Advertisement advertisement){
        advertisementService.save(advertisement);

        log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        log.info("Advertisement is successfully saved: " + advertisement.toString());
        log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }


    //ONLY PRIVILIGED SHAFAH USERS CAN DELETE BY ID
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        advertisementService.delete(id);
    }


    //DELETE ENDPOINT FOR OWNER
    @PostMapping("/owner-delete")
    public void deleteById(@RequestBody Matcher matcher){
        advertisementService.delete(matcher.getId(), matcher.getKey());

    }





}
