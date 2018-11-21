package az.shafag.testapp.service;


import az.shafag.testapp.dto.SearchDTO;

import java.util.Set;

/**
 * @author Qurban Azimli
 *
 *
 *
 * @param <T> stands for Data Transfer objects
 * @param <U> stands for Entities
 * @param <V> stands for id
 */

public abstract class  AbstractService<T,U,V> {





    public abstract void save(U u);

    /**
     *
     * @param id
     * @return unique Data Transfer Object with matching id
     */
    public abstract T getById(V id);

    /**
     *
     * @return Set of all active T type Data transfer Objects for user.
     */
    public abstract Set<T> getAllActive();

    /**
     *
     * @return Set of all Data Transfer Objects for privileged Users
     * are able to access this data
     */
    public abstract Set<T> getAll();

    /**
     *
     * @param searchDTO
     * @return Filtered Set of Data Transfer Objects.
     */
    public abstract Set<T> getAllByFilter(SearchDTO searchDTO);
    public abstract void delete(V id);




}
