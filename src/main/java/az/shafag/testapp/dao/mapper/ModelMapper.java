package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.ModelDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ModelMapper {

    @Select("select * from shefeq.models where id=#{id} and is_active=1 ")
    ModelDTO getById(Long id);
    @Select("select * from shefeq.models")
    List<ModelDTO> getAll();
    @Select("select * from shefeq.models is_active=1 ")
    List<ModelDTO> getAllActive();
}
