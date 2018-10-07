package az.shafag.testapp.service;

import az.shafag.testapp.annotation.ServiceMethod;
import az.shafag.testapp.dto.AdvertisementDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static az.shafag.testapp.constant.ServiceName.*;

@Service(ADVERTISEMENT)
public class AdvertisementService extends AbstractService {


    @ServiceMethod
    public void save(){

    }

}
