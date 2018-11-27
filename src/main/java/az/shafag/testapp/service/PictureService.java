package az.shafag.testapp.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class PictureService {

    //Method not ready for production
    public byte[] getById(@PathVariable Long id){
        return null;
    }

}
