package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Differential;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DifferentialRepository extends CrudRepository<Differential,Long> {
}
