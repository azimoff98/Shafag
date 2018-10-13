package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Long, Owner> {
}
