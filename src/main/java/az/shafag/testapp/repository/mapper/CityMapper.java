package az.shafag.testapp.repository.mapper;

import az.shafag.testapp.dto.CityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("select * from shefeq.cities where id=#{id} and is_active = 1")
    CityDTO getById(Long id);

    @Select("select * from shefeq.cities")
    List<CityDTO> getAll();

    @Select("select * from shefeq.cities where isActive = 1")
    List<CityDTO> getAllActive();


}
