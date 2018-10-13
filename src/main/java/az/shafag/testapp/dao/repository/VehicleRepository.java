package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository  extends CrudRepository<Vehicle,Long> {




}
