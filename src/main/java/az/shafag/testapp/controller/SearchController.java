package az.shafag.testapp.controller;

import az.shafag.testapp.dto.AdvertisementDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/search")
public class SearchController {


    @Autowired
    private AdvertisementService advertisementService;


    @PostMapping
    public Set<AdvertisementDTO> search(@RequestBody SearchDTO searchDTO){


        return advertisementService.getAllByFilter(searchDTO);

    }


}
