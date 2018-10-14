package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.FuelType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends CrudRepository <FuelType, Long> {

}
