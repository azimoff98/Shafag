package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.OwnerMapper;
import az.shafag.testapp.dao.repository.OwnerRepository;
import az.shafag.testapp.dto.AdvertisementDTO;
import az.shafag.testapp.dto.OwnerDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(OWNER)
public class OwnerService extends AbstractService<OwnerDTO, Owner, Long> {

    @Autowired
    private OwnerRepository repository;
    @Autowired
    private OwnerMapper mapper;

    @Override
    public void save(Owner owner) {
        try{
            if(!Objects.isNull(owner)
                    && !Objects.isNull(owner.getName())
                    && !Objects.isNull(owner.getEmail())
                    && !Objects.isNull(owner.getPhoneNumber())){
                repository.save(owner);
            }else{
                throw new ShafagException("user cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public OwnerDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<OwnerDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<OwnerDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Set<AdvertisementDTO> getAllAddsOfOwner(Owner owner){
        try{
            if(owner.getAdds().size() > 1){
                return mapper.getAllAdds(owner);

            }
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        return null;
    }
}
