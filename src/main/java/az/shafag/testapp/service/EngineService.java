//package az.shafag.testapp.service;
//
//import az.shafag.testapp.dao.mapper.EngineMapper;
//import az.shafag.testapp.dao.repository.EngineRepository;
//import az.shafag.testapp.dto.EngineDTO;
//import az.shafag.testapp.dto.SearchDTO;
//import az.shafag.testapp.exception.ShafagException;
//import az.shafag.testapp.model.Engine;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//import java.util.Set;
//
//import static az.shafag.testapp.constant.ServiceName.*;
//@Service(ENGINE)
//public class EngineService extends AbstractService<EngineDTO, Engine, Long> {
//    @Autowired
//    private EngineRepository repository;
//    @Autowired
//    private EngineMapper mapper;
//
//    @Override
//    public void save(Engine engine) {
//        try{
//            if(!Objects.isNull(engine) && !Objects.isNull(engine.getVolume())){
//                repository.save(engine);
//            }else{
//                throw new ShafagException("Engine cannot be added");
//            }
//        }catch (ShafagException e){
//            e.getMessage();
//        }
//    }
//
//    @Override
//    public EngineDTO getById(Long id) {
//        return mapper.getById(id);
//    }
//
//    @Override
//    public Set<EngineDTO> getAll() {
//        return mapper.getAll();
//    }
//
//    @Override
//    public Set<EngineDTO> getAll(SearchDTO searchDTO) {
//        return null;
//    }
//
//    @Override
//    public void delete(Long id) {
//        repository.deleteById(id);
//    }
//}
