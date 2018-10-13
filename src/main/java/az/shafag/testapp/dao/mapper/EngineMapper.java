package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.EngineDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EngineMapper {

    @Select("select * from shefeq.engine where id=#{id}")
    EngineDTO getById(Long id);

    @Select("select * from shefeq.engine")
    List<EngineDTO> getAll();



}
