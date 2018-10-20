package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
}
