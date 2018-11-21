package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.GearBoxMapper;
import az.shafag.testapp.dao.repository.GearBoxRepository;
import az.shafag.testapp.dto.GearBoxDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.GearBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(GEARBOX)
public class GearBoxService extends AbstractService<GearBoxDTO, GearBox, Long> {
    @Autowired
    private GearBoxRepository repository;
    @Autowired
    private GearBoxMapper mapper;


    @Override
    public void save(GearBox gearBox) {

            if(!Objects.isNull(repository) && !Objects.isNull(gearBox.getName())){
                repository.save(gearBox);
            }else{
                throw new ShafagException("gearbox cannot be added");
            }

    }

    @Override
    public GearBoxDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<GearBoxDTO> getAllActive() {
        return mapper.getAllActive();
    }

    @Override
    public Set<GearBoxDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<GearBoxDTO> getAllByFilter(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
