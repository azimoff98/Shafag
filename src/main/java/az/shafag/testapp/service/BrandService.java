package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.BrandMapper;
import az.shafag.testapp.dao.repository.BrandRepository;
import az.shafag.testapp.dto.BrandDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(BRAND)
public class BrandService extends AbstractService<BrandDTO, Brand, Long> {


    @Autowired
    private BrandRepository repository;
    @Autowired
    private BrandMapper mapper;


    @Override
    public void save(Brand brand) {
        try{
            if(!Objects.isNull(brand) && !Objects.isNull(brand.getName())){
                repository.save(brand);
            }else{
                throw new ShafagException("Brand cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public BrandDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<BrandDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<BrandDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
