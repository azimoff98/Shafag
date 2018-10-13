package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.OwnerDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OwnerMapper {

    @Select("select * from shefeq.owners where id=#{id} and is_active = 1")
    OwnerDTO getById(Long id);

    @Select("select * from shefeq.owners")
    List<OwnerDTO> getAll();

    @Select("select * from shefeq.owners where isActive = 1")
    List<OwnerDTO> getAllActive();


}
