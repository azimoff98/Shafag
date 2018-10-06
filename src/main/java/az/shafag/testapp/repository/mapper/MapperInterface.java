package az.shafag.testapp.repository.mapper;

import java.util.List;

public interface MapperInterface<T,V> {
    List<T> getById(V id);
    List<T> getAll();
    List<T> getAllActive();
}
