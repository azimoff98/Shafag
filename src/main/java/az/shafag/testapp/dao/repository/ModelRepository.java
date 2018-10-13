package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends CrudRepository<Long, Model> {
}
