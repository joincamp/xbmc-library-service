package com.springapp.mvc.dao;

import com.springapp.mvc.dto.EpisodesDTO;
import com.springapp.mvc.model.Episode;
import com.springapp.mvc.model.TVShow;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EpisodeDaoImpl extends AbstractDaoImpl<Episode, Integer> implements EpisodeDao {
    protected EpisodeDaoImpl() {
        super(Episode.class);
    }

    public List<Episode> getAllEpisodes() {
        return findByCriteria(Restrictions.isNotNull("episodeid"));
    }
}
