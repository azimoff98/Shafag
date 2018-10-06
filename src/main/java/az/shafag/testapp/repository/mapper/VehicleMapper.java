package az.shafag.testapp.repository.mapper;


import az.shafag.testapp.dto.ColorDTO;
import az.shafag.testapp.dto.FuelTypeDTO;
import az.shafag.testapp.dto.VehicleDTO;
import org.apache.ibatis.annotations.*;

import javax.persistence.ManyToMany;
import java.util.List;

@Mapper
public interface VehicleMapper {


    @Results(value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "fuelType", column = "fuel_type_id", javaType = FuelTypeDTO.class,
                    many = @Many(select = "az.shafag.testapp.repository.mapper.FuelTypeMapper.getById")),
            @Result(property = "color", column = "color_id", javaType = ColorDTO.class,
                    many = @Many(select = "az.shafag.testapp.repository.mapper.ColorMapper.getById"))
    })
    @Select("select * from shefeq.vehicle where id=#{id} and is_active=1 ")
    List<VehicleDTO> getById(Long id);

    @Select("select * from shefeq.fuel_type")
    List<FuelTypeDTO> getAll();

    @Select("select * from shefeq.fuel_type is_active=1 ")
    List<FuelTypeDTO> getAllActive();
}
