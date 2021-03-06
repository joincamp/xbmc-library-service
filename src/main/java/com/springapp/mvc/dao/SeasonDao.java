package com.springapp.mvc.dao;

import com.springapp.mvc.model.Season;
import com.springapp.mvc.model.TVShow;

import java.util.List;

public interface SeasonDao extends AbstractDao<Season, Integer> {
    List<Season> getAllSeasons(Integer showId);
}