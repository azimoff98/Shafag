package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<Long, City> {
}
