package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.GearBox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GearBoxRepository extends CrudRepository<GearBox,Long> {
}
