package az.shafag.testapp.repository.mapper;

import az.shafag.testapp.dto.BodyTypeDTO;
import az.shafag.testapp.dto.DiferentialDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DifferentialMapper {

    @Select("select * from shefeq.brands where id=#{id} and is_active = 1")
    DiferentialDTO getById(Long id);

    @Select("select * from shefeq.brands")
    List<DiferentialDTO> getAll();

    @Select("select * from shefeq.brands where isActive = 1")
    List<DiferentialDTO> getAllActive();

}
