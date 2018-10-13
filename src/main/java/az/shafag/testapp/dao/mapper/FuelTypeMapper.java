package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.FuelTypeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FuelTypeMapper {


    @Select("select * from shefeq.fuel_type where id=#{id} and is_active=1 ")
    FuelTypeDTO getById(Long id);
    @Select("select * from shefeq.fuel_type")
    List<FuelTypeDTO> getAll();
    @Select("select * from shefeq.fuel_type is_active=1 ")
    List<FuelTypeDTO> getAllActive();
}
