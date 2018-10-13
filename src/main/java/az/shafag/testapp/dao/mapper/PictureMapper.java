package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.BrandDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PictureMapper {

    @Select("select * from shefeq.pictures where id=#{id} and is_active = 1")
    BrandDTO getById(Long id);

    @Select("select * from shefeq.pictures where vehicle_id=#{id} and is_active = 1")
    BrandDTO getByVehicleId(Long id);




}
