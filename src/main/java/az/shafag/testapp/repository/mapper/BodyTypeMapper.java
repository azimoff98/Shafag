package az.shafag.testapp.repository.mapper;

import az.shafag.testapp.dto.BodyTypeDTO;
import az.shafag.testapp.model.BodyType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BodyTypeMapper {


    @Select("select * from shefeq.body_type where id=#{id} and is_active = 1")
    BodyTypeDTO getById(Long id);

    @Select("select * from shefeq.body_type")
    List<BodyTypeDTO> getAll();

    @Select("select * from shefeq.body_type where isActive = 1")
    List<BodyTypeDTO> getAllActive();



}
