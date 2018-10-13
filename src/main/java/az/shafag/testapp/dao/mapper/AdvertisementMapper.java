package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.AdvertisementDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
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
            @Result(property = "city", column = "city_id"),


        }
    )


    @Select("select * from advertisement where id=#{id} and is_active=1")
    AdvertisementDTO getById(Long id);

    @Select("select * from advertisement")
    Set<AdvertisementDTO> getAll();

    @Select("select * from advertisement where is_active=1")
    Set<AdvertisementDTO> getAllActive();


}
