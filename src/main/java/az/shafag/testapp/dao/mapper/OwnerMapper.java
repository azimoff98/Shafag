package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.AdvertisementDTO;
import az.shafag.testapp.dto.OwnerDTO;
import az.shafag.testapp.model.Advertisement;
import az.shafag.testapp.model.Owner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface OwnerMapper {

    @Select("select * from shefeq.owners where id=#{id} and is_active = 1")
    OwnerDTO getById(Long id);

    @Select("select * from shefeq.owners")
    Set<OwnerDTO> getAll();

    @Select("select * from shefeq.owners where isActive = 1")
    Set<OwnerDTO> getAllActive();

    @Select("select * from shefeq.advertisement where owner_id=#{id}")
    Set<AdvertisementDTO> getAllAdds(Owner owner);


}
