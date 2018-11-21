package az.shafag.testapp.service;


import az.shafag.testapp.dao.mapper.DifferentialMapper;
import az.shafag.testapp.dao.repository.DifferentialRepository;
import az.shafag.testapp.dto.DiferentialDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Differential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(DIFFERENTIAL)
public class DifferentialService extends AbstractService<DiferentialDTO, Differential, Long> {

    @Autowired
    private DifferentialRepository repository;
    @Autowired
    private DifferentialMapper mapper;


    @Override
    public void save(Differential differential) {

            if(!Objects.isNull(differential) && !Objects.isNull(differential.getName())){
                repository.save(differential);
            }else{
                throw new ShafagException("differantial cannot be added ");
            }


    }

    @Override
    public DiferentialDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<DiferentialDTO> getAllActive() {
        return null;
    }

    @Override
    public Set<DiferentialDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<DiferentialDTO> getAllByFilter(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
