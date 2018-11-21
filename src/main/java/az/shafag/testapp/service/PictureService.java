package az.shafag.testapp.service;

import az.shafag.testapp.utility.FileServer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class PictureService {

    //Method not ready for production
    public byte[] getById(@PathVariable Long id){
        return null;
    }

}
