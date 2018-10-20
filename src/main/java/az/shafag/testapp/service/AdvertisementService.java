package az.shafag.testapp.service;
import az.shafag.testapp.dao.mapper.AdvertisementMapper;
import az.shafag.testapp.dao.repository.AdvertisementRepository;
import az.shafag.testapp.dto.AdvertisementDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Advertisement;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(ADVERTISEMENT)
public class AdvertisementService extends AbstractService<AdvertisementDTO, Advertisement, Long> {


    @Autowired
    private AdvertisementRepository repository;
    @Autowired
    private AdvertisementMapper mapper;



    @Override
    public void save(Advertisement advertisement) {

        String key = generateKey();
        advertisement.setKey(key);
        try {
            if(!Objects.isNull(advertisement)
                    && !Objects.isNull(advertisement.getPrice())
                    && !Objects.isNull(advertisement.getCity())
                    && !Objects.isNull(advertisement.getCurrency())
                    && !Objects.isNull(advertisement.getOwner())
                    && !Objects.isNull(advertisement.getApplier())
                    && !Objects.isNull(advertisement.getVehicle())){
                repository.save(advertisement);
            }
            else {
               throw new ShafagException("this advertisement cannot be saved");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public AdvertisementDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<AdvertisementDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<AdvertisementDTO> getAll(SearchDTO searchDTO) {
        return mapper.getAllActive();
    }

    //ONLY PRIVILEGED USERS CAN DELETE BY ID
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    //Only owner of an advertisement can delete by matching key
    public void delete(Long id,String key){
        try{
            if(!Objects.isNull(key) && getById(id).getKey().equals(key)){
                mapper.deleteByKey(key);
            }else{
                throw new ShafagException("key is not matching...");
            }
        }catch (ShafagException e){
            e.getMessage();
        }
    }

    private String generateKey(){
        int length = 6;
        return RandomStringUtils.random(length, true, true);

    }




}
