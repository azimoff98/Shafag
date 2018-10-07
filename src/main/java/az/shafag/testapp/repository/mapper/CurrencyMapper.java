package az.shafag.testapp.repository.mapper;


import az.shafag.testapp.dto.BodyTypeDTO;
import az.shafag.testapp.dto.CurrencyDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CurrencyMapper {


    @Select("select * from shefeq.currency where id=#{id} and is_active = 1")
    CurrencyDTO getById(Long id);

    @Select("select * from shefeq.currency")
    List<CurrencyDTO> getAll();

    @Select("select * from shefeq.currency where isActive = 1")
    List<CurrencyDTO> getAllActive();



}
