package az.shafag.testapp.utility;

import az.shafag.testapp.dto.FilterItem;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import static az.shafag.testapp.utility.Utility.buildFilterItemList;


public class FilterItemTypeHandler extends BaseTypeHandler<Set<FilterItem>> {

    private ObjectMapper mapper;

    public FilterItemTypeHandler() {
        mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    }


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Set<FilterItem> cities, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public Set<FilterItem> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String res = resultSet.getString(s);
        return buildFilterItemList(res);
    }

    @Override
    public Set<FilterItem> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String res = resultSet.getString(i);
        return buildFilterItemList(res);
    }

    @Override
    public Set<FilterItem> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }

}
