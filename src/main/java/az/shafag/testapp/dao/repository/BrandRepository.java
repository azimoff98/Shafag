package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Long, Brand> {
}
