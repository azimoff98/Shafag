package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.CityMapper;
import az.shafag.testapp.dao.repository.CityRepository;
import az.shafag.testapp.dto.CityDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;


@Service(CITY)
public class CityService extends AbstractService<CityDTO, City, Long >{

    @Autowired
    private CityRepository repository;

    @Autowired
    private CityMapper mapper;



    @Override
    public void save(City city) {
        try{
            if(!Objects.isNull(city) && !Objects.isNull(city.getName())){
                repository.save(city);
            }else{
                throw new ShafagException("city cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public CityDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<CityDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<CityDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
