package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.BrandDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BrandMapper {

    @Select("select * from shefeq.brands where id=#{id} and is_active = 1")
    BrandDTO getById(Long id);

    @Select("select * from shefeq.brands")
    List<BrandDTO> getAll();

    @Select("select * from shefeq.brands where isActive = 1")
    List<BrandDTO> getAllActive();


}
