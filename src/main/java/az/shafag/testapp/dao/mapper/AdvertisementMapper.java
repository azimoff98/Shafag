package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dao.provider.AdvertisementProvider;
import az.shafag.testapp.dto.*;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Mapper
public interface AdvertisementMapper {


    @Results(value = {

            @Result(property = "id", column = "id", id=true),
            @Result(property = "date", column = "date", javaType = Date.class),
            @Result(property = "description", column = "description"),
            @Result(property = "isActive", column = "is_active"),
            @Result(property = "key", column = "key"),
            @Result(property = "label", column = "label"),
            @Result(property = "lastUpdate", column = "last_update", javaType = Date.class),
            @Result(property = "price", column = "price"),
            @Result(property = "seenCount", column = "seen_count"),
            @Result(property = "status", column = "status"),
            @Result(property = "city", column = "city_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.CityMapper.getById"),javaType = CityDTO.class),
            @Result(property = "currencyDTO", column = "currency_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.CurrencyMapper.getById"), javaType = CurrencyDTO.class),
            @Result(property = "ownerDTO", column = "owner_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.OwnerMapper.getById"), javaType = OwnerDTO.class),
            @Result(property = "userDTO", column = "applier_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.UserMapper.getById"), javaType = UserDTO.class),
            @Result(property = "vehicleDTO", column = "vehicle_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.VehicleMapper.getById"))
        }
    )
    @Select("select * from advertisement where id=#{id} and is_active=1")
    AdvertisementDTO getById(Long id);

    @Results(value = {

            @Result(property = "id", column = "id", id=true),
            @Result(property = "date", column = "date", javaType = Date.class),
            @Result(property = "description", column = "description"),
            @Result(property = "isActive", column = "is_active"),
            @Result(property = "key", column = "key"),
            @Result(property = "label", column = "label"),
            @Result(property = "lastUpdate", column = "last_update", javaType = Date.class),
            @Result(property = "price", column = "price"),
            @Result(property = "seenCount", column = "seen_count"),
            @Result(property = "status", column = "status"),
            @Result(property = "cityDTO", column = "city_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.CityMapper.getById"),javaType = CityDTO.class),
            @Result(property = "currencyDTO", column = "currency_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.CurrencyMapper.getById"), javaType = CurrencyDTO.class),
            @Result(property = "ownerDTO", column = "owner_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.OwnerMapper.getById"), javaType = OwnerDTO.class),
            @Result(property = "userDTO", column = "applier_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.UserMapper.getById"), javaType = UserDTO.class),
            @Result(property = "vehicleDTO", column = "vehicle_id",
                    many = @Many(select = "az.shafag.testapp.dao.mapper.VehicleMapper.getById"))
    }
    )
    @SelectProvider(type = AdvertisementProvider.class,method = "getAdvertisementsByFilter")
    Set<AdvertisementDTO> getAllByFilter(SearchDTO searchDTO);

    @Select("select * from advertisement")
    Set<AdvertisementDTO> getAll();

    @Select("select * from advertisement where is_active=1")
    Set<AdvertisementDTO> getAllActive();

    @Delete("delete * from shefeq.table where key=#{key} and is_active=1")
    void deleteByKey(String key);




}
