package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long> {
    void deleteByKey(String key);
}
