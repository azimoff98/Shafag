package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.*;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Mapper
public interface VehicleMapper {


    @Results(value = {
            //id
            @Result(property = "id", column = "id", id = true),
            //engine
            @Result(property = "engine", column = "engine", javaType = EngineDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.EngineMapper.getById")),
            //horsepower
            @Result(property = "horsePower", column = "horse_power"),
            //isNew
            @Result(property = "isNew", column = "new"),

            //millage
            @Result(property = "millage", column = "millage"),
            //YEAR
            @Result(property = "yaer", column = "year", javaType = Date.class),
            //bodyType
            @Result(property = "bodyType", column = "body_type_id", javaType = BodyTypeDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.BodyTypeId.getById")),
            //brand
            @Result(property = "brand", column = "brand_id", javaType = BrandDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.BrandMapper.getById")),
            //color
            @Result(property = "color", column = "color_id", javaType = ColorDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.ColorMapper.getById")),
            //differential
            @Result(property = "differential", column = "differential_id", javaType = DiferentialDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.DifferentialMapper.getById")),
            //fuelType
            @Result(property = "fuelType", column = "fuel_type_id", javaType = FuelTypeDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.FuelTypeMapper.getById")),
            //color
            @Result(property = "gearBox", column = "gearbox_id", javaType = GearBoxDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.GearBoxMapper.getById")),
            //MODEL
            @Result(property = "model", column = "model_id", javaType = ModelDTO.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.ModelMapper.getById")),
            //PICTURE
            @Result(property = "pictures", column = "id", javaType = Set.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.PictureMapper.getByVehicleId")),
            @Result(property = "specs", column = "id", javaType = Set.class,
                    many = @Many(select = "az.shafag.testapp.dao.mapper.SpecMapper.getByVehicleId")
            )
    })

    @Select("select * from shefeq.vehicle where id=#{id} and is_active=1 ")
    VehicleDTO getById(Long id);

    @Select("select * from shefeq.fuel_type")
    Set<VehicleDTO> getAll();

    @Select("select * from shefeq.fuel_type is_active=1 ")
    Set<VehicleDTO> getAllActive();
}