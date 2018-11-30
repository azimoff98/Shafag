package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.BrandMapper;
import az.shafag.testapp.dao.repository.BrandRepository;
import az.shafag.testapp.dao.repository.VehicleRepository;
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


    private final BrandRepository repository;

    private final VehicleRepository vehicleRepository;

    private final BrandMapper mapper;

    public BrandService(BrandRepository repository, VehicleRepository vehicleRepository, BrandMapper mapper) {
        this.repository = repository;
        this.vehicleRepository = vehicleRepository;
        this.mapper = mapper;
    }

    @Override
    public void save(Brand brand) {

            if(!Objects.isNull(brand) && !Objects.isNull(brand.getName())){
                repository.save(brand);
            }else{
                throw new ShafagException("Brand cannot be added");
            }


    }

    @Override
    public BrandDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<BrandDTO> getAllActive() {
        return mapper.getAllActive();
    }

    @Override
    public Set<BrandDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<BrandDTO> getAllByFilter(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);
    }
}
