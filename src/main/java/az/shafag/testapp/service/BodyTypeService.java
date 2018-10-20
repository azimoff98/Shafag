package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.BodyTypeMapper;
import az.shafag.testapp.dao.repository.BodyTypeRepository;
import az.shafag.testapp.dto.BodyTypeDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.BodyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;


@Service(BODY_TYPE)
public class BodyTypeService extends AbstractService<BodyTypeDTO, BodyType, Long> {


    @Autowired
    private BodyTypeRepository repository;
    @Autowired
    private BodyTypeMapper mapper;



    @Override
    public void save(BodyType bodyType) {
        try{
            if(!Objects.isNull(bodyType) && !Objects.isNull(bodyType.getName())){
                repository.save(bodyType);
            }else{
                throw new ShafagException("BodyType cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }


    }

    @Override
    public BodyTypeDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<BodyTypeDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<BodyTypeDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);


    }
}
