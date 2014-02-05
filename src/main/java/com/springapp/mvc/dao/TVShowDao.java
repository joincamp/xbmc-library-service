package com.springapp.mvc.dao;

import com.springapp.mvc.model.TVShow;

import java.util.List;

public interface TVShowDao extends AbstractDao<TVShow, Integer> {
    List<TVShow> getAllTVShows();
}