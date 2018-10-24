package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Users;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users,Long> {
    Users findByUsername(String username);
}
