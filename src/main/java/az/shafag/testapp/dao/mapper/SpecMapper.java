package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.BrandDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SpecMapper {

    @Select("select * from shefeq.specs where id=#{id} and is_active = 1")
    BrandDTO getById(Long id);

    @Select("select * from shefeq.vehicle_specs vs" +
            "left join shefeq.specs s on vs.specs_id=s.id " +
            " where vs.vehicle_id=#{id} and s.is_active = 1")
    BrandDTO getByVehicleId(Long id);




}
