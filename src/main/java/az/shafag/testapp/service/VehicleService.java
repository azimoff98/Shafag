package az.shafag.testapp.service;


import az.shafag.testapp.dao.mapper.VehicleMapper;
import az.shafag.testapp.dao.repository.VehicleRepository;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.dto.VehicleDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        try{
            if(!Objects.isNull(vehicle)
                    && !Objects.isNull(vehicle.getBrand())
                    && !Objects.isNull(vehicle.getModel())
                    && !Objects.isNull(vehicle.getBodyType())
                    && !Objects.isNull(vehicle.getColor())
                    && !Objects.isNull(vehicle.getDifferential())
                    && !Objects.isNull(vehicle.getEngine())
                    && !Objects.isNull(vehicle.getFuelType())
                    && !Objects.isNull(vehicle.getGearBox())
                    && !Objects.isNull(vehicle.getHorsePower())
                    && !Objects.isNull(vehicle.getIsNew())
                    && !Objects.isNull(vehicle.getMillage())
                    && !Objects.isNull(vehicle.getYear())
                    ){
                repository.save(vehicle);
            }else {
                throw new ShafagException("vehicle cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
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
        repository.deleteById(id);
    }
}
