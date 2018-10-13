package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends CrudRepository<Long, Color> {
}
