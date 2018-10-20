package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.ModelDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface ModelMapper {

    @Select("select * from shefeq.models where id=#{id} and is_active=1 ")
    ModelDTO getById(Long id);
    @Select("select * from shefeq.models")
    Set<ModelDTO> getAll();
    @Select("select * from shefeq.models is_active=1 ")
    Set<ModelDTO> getAllActive();
}
