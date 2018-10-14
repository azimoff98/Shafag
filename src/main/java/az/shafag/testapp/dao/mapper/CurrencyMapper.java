package az.shafag.testapp.dao.mapper;


import az.shafag.testapp.dto.CurrencyDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface CurrencyMapper {


    @Select("select * from shefeq.currency where id=#{id} and is_active = 1")
    CurrencyDTO getById(Long id);

    @Select("select * from shefeq.currency")
    Set<CurrencyDTO> getAll();

    @Select("select * from shefeq.currency where isActive = 1")
    Set<CurrencyDTO> getAllActive();



}
