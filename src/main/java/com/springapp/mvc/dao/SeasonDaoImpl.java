package com.springapp.mvc.dao;

import com.springapp.mvc.model.Season;
import com.springapp.mvc.model.TVShow;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeasonDaoImpl extends AbstractDaoImpl<Season, Integer> implements SeasonDao {
    protected SeasonDaoImpl() {
        super(Season.class);
    }

    public List<Season> getAllSeasons(Integer showId) {
        //TODO: add criteria
        //return findByCriteria();
        return null;
    }
}
