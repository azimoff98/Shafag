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
    public abstract T getById(V id);
    public abstract Set<T> getAll();
    public abstract Set<T> getAll(SearchDTO searchDTO);
    public abstract void delete(V id);




}
