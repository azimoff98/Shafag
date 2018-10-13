package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.BodyType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyTypeRepository extends CrudRepository<BodyType ,Long> {
}
