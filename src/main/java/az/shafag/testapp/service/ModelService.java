package az.shafag.testapp.service;


import az.shafag.testapp.dao.mapper.ModelMapper;
import az.shafag.testapp.dao.repository.ModelRepository;
import az.shafag.testapp.dto.ModelDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(MODEL)
public class ModelService extends AbstractService<ModelDTO, Model, Long> {


    @Autowired
    private ModelRepository repository;
    @Autowired
    private ModelMapper mapper;


    @Override
    public void save(Model model) {
        try {
            if(!Objects.isNull(model) && !Objects.isNull(model.getName())){
                repository.save(model);
            }else{
                throw new ShafagException("model cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }
    }

    @Override
    public ModelDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<ModelDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<ModelDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
