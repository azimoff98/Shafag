package az.shafag.testapp.dao.mapper;

import az.shafag.testapp.dto.FilterDto;
import az.shafag.testapp.utility.FilterItemTypeHandler;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

import static az.shafag.testapp.constant.Query.FILTER_QUERY;

public interface FilterMapper {
    @Results(value = {

            @Result(property = "colors",column = "colors",javaType = Set.class,typeHandler = FilterItemTypeHandler.class)
    })
    @Select(FILTER_QUERY)
    FilterDto getFilterDto();
}
