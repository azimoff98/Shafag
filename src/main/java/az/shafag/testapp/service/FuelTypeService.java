package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.FuelTypeMapper;
import az.shafag.testapp.dao.repository.FuelTypeRepository;
import az.shafag.testapp.dto.FuelTypeDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.FuelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(FUEL_TYPE)
public class FuelTypeService extends AbstractService<FuelTypeDTO, FuelType, Long>  {

    @Autowired
    private FuelTypeRepository repository;
    @Autowired
    private FuelTypeMapper mapper;


    @Override
    public void save(FuelType fuelType) {
        try{
            if(!Objects.isNull(fuelType) && !Objects.isNull(fuelType.getId())){
                repository.save(fuelType);
            }else{
                throw new ShafagException("fuel type cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public FuelTypeDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<FuelTypeDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<FuelTypeDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }


}
