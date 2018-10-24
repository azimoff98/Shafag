package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Picture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends CrudRepository<Picture,Long> {
}
