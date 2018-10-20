package az.shafag.testapp.service;

import az.shafag.testapp.dao.mapper.UserMapper;
import az.shafag.testapp.dao.repository.UserRepository;
import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.dto.UserDTO;
import az.shafag.testapp.exception.ShafagException;
import az.shafag.testapp.model.Advertisement;
import az.shafag.testapp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

import static az.shafag.testapp.constant.ServiceName.*;

@Service(SHAFAG_USER)
public class UserService extends AbstractService<UserDTO, Users, Long> {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper mapper;


    @Override
    public void save(Users user) {
        try {
            if(!Objects.isNull(user)
                    && !Objects.isNull(user.getName())
                    && !Objects.isNull(user.getEmail())
                    && !Objects.isNull(user.getUsername())
                    && !Objects.isNull(user.getPassword())
                    ){
                repository.save(user);
            }else {
                throw new ShafagException("user cannot be added");
            }
        }catch (ShafagException e){
            e.getMessage();
        }

    }

    @Override
    public UserDTO getById(Long id) {
        return mapper.getById(id);
    }

    @Override
    public Set<UserDTO> getAll() {
        return mapper.getAll();
    }

    @Override
    public Set<UserDTO> getAll(SearchDTO searchDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void approve(Users user, Advertisement advertisement){
        advertisement.setIsActive(1);
        user.getAdds().add(advertisement);
    }
}
