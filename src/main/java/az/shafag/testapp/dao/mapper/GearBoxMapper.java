package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.GearBoxDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.Set;

@Mapper
public interface GearBoxMapper {

    @Select("select * from shefeq.gearbox where id=#{id} and is_active = 1")
    GearBoxDTO getById(Long id);

    @Select("select * from shefeq.gearbox")
    Set<GearBoxDTO> getAll();

    @Select("select * from shefeq.gearbox where isActive = 1")
    Set<GearBoxDTO> getAllActive();

}
