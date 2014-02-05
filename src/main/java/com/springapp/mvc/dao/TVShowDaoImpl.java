package com.springapp.mvc.dao;

import com.springapp.mvc.model.TVShow;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TVShowDaoImpl extends AbstractDaoImpl<TVShow, Integer> implements TVShowDao {
    protected TVShowDaoImpl() {
        super(TVShow.class);
    }

    public List<TVShow> getAllTVShows() {
        return findByCriteria(Restrictions.isNotNull("id"));
    }
}
