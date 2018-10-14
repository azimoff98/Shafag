package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface UserMapper {

    @Select("select * from shefeq.shafag_user where id=#{id} and is_active = 1")
    UserDTO getById(Long id);

    @Select("select * from shefeq.shafag_user where is_active = 1")
    Set<UserDTO> getAll();


}
