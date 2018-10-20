package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.GearBoxMapper;
import az.shafag.testapp.dao.mapper.RoleMapper;
import az.shafag.testapp.dao.repository.GearBoxRepository;
import az.shafag.testapp.dao.repository.RoleRepository;
import az.shafag.testapp.dto.GearBoxDTO;
import az.shafag.testapp.dto.RoleDTO;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.GearBox;
import az.shafag.testapp.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.GEARBOX;
import static az.shafag.testapp.constant.ServiceName.ROLE;

@Service(ROLE)
public class RoleService extends AbstractService<RoleDTO, Role, Long> {


    @Autowired
    private RoleRepository repository;
    @Autowired
    private RoleMapper mapper;


    @Override
    public void save(Role role) {
        try{
            if(!Objects.isNull(role) && !Objects.isNull(role.getLabel())){
                repository.save(role);
            }else{
                throw new ShafagException("role cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public RoleDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<RoleDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<RoleDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
