package az.shafag.testapp.controller;

import az.shafag.testapp.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pictures")
public class PictureController {


    @Autowired
    private PictureService pictureService;

    @GetMapping(value = "/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getById(@PathVariable Long id){
       return pictureService.getById(id);
    }




}
