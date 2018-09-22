package az.shafag.testapp.service;

import az.shafag.testapp.annotation.ServiceMethod;
import org.springframework.stereotype.Service;
import static az.shafag.testapp.constant.ServiceName.*;

@Service(ADVERTISEMENT)
public class AdvertisementService extends AbstractService {

    @ServiceMethod
    public void save(){


    }

}
