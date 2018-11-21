package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.ColorMapper;
import az.shafag.testapp.dao.repository.ColorRepository;
import az.shafag.testapp.dto.ColorDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;


@Service(COLOR)
public class ColorService  extends AbstractService<ColorDTO, Color, Long>{

    @Autowired
    private ColorRepository repository;
    @Autowired
    private ColorMapper mapper;


    @Override
    public void save(Color color) {

            if(!Objects.isNull(color) && !Objects.isNull(color.getName())){
                repository.save(color);
            }else{
                throw new ShafagException("color cannot be added");
            }

    }

    @Override
    public ColorDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<ColorDTO> getAllActive() {
        return null;
    }

    @Override
    public Set<ColorDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<ColorDTO> getAllByFilter(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
