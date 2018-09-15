package az.shafag.testapp.repository;

import az.shafag.testapp.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository  extends CrudRepository<Vehicle,Long> {

}
