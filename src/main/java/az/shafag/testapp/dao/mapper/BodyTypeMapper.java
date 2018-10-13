package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.BodyTypeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface BodyTypeMapper {


    @Select("select * from shefeq.body_type where id=#{id} and is_active = 1")
    BodyTypeDTO getById(Long id);

    @Select("select * from shefeq.body_type")
    Set<BodyTypeDTO> getAll();

    @Select("select * from shefeq.body_type where isActive = 1")
    Set<BodyTypeDTO> getAllActive();



}
