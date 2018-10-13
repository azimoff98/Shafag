package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.ColorDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ColorMapper {

    @Select("select * from shefeq.color where id=#{id}")
    ColorDTO getById(Long id);

    @Select("select * from shefeq.color")
    List<ColorDTO> getAll();


}
