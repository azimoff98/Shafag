package az.shafag.testapp.service;


import az.shafag.testapp.dao.mapper.VehicleMapper;
import az.shafag.testapp.dao.repository.VehicleRepository;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.dto.VehicleDTO;
import az.shafag.testapp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;


@Service(VEHICLE)
public class VehicleService extends AbstractService<VehicleDTO,Vehicle,Long>{


    @Autowired
    private VehicleRepository repository;
    @Autowired
    private VehicleMapper mapper;

    @Override
    public void save(Vehicle vehicle) {
        if(!Objects.isNull(vehicle)){
            repository.save(vehicle);
        }
    }

    @Override
    public VehicleDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<VehicleDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<VehicleDTO> getAll(SearchDTO searchDTO) {
        return mapper.getAllActive();
    }

    @Override
    public void delete(Long id) {

    }
}
