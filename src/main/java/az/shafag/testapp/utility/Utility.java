package az.shafag.testapp.utility;

import az.shafag.testapp.dto.FilterItem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;

public class Utility {
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }
    public static Set<FilterItem> buildFilterItemList(String res) {
        Set<FilterItem> list = new HashSet<>();
        if (Objects.nonNull(res)) {
            try {
                List<String> list1 = mapper.readValue(res, new TypeReference<List<String>>() {
                });
                list1.forEach(item -> {
                    try {
                        list.add(mapper.readValue(item, FilterItem.class));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                System.out.println(res);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return list;
    }
}
