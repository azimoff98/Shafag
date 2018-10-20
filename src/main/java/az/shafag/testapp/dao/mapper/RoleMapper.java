package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.RoleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface RoleMapper {


    @Select("select * from shefeq.roles where id=#{id}")
    RoleDTO getById(Long id);

    @Select("select * from shefeq.roles")
    Set<RoleDTO> getAll();



}
