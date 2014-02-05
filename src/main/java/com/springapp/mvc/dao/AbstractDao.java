package com.springapp.mvc.dao;

import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface AbstractDao<E, I extends Serializable> {
    Session getCurrentSession();

    E findById(I id);

    void saveOrUpdate(E e);

    void delete(E e);

    List findByCriteria(Criterion criterion);
}
