package com.springapp.mvc.dao;

import com.springapp.mvc.model.Episode;
import com.springapp.mvc.model.TVShow;

import java.util.List;

public interface EpisodeDao extends AbstractDao<Episode, Integer> {
    List<Episode> getAllEpisodes();
}