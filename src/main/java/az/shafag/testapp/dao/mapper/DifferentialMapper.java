package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.DiferentialDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface DifferentialMapper {

    @Select("select * from shefeq.differential where id=#{id} and is_active = 1")
    DiferentialDTO getById(Long id);

    @Select("select * from shefeq.differential")
    Set<DiferentialDTO> getAll();

    @Select("select * from shefeq.differential where isActive = 1")
    Set<DiferentialDTO> getAllActive();

}
