package com.springapp.mvc.dto;

import com.springapp.mvc.model.Limits;
import com.springapp.mvc.model.TVShow;

import java.util.List;

/**
 * Created by jcamp on 2/5/14.
 */
public class TVShowsDTO extends AbstractResultDTO {
    List<TVShow> tvshows;

    public TVShowsDTO(Limits limits, List<TVShow> tvshows) {
        super(limits);
        this.tvshows = tvshows;
    }

    public List<TVShow> getTvshows() {
        return tvshows;
    }

    public void setTvshows(List<TVShow> tvshows) {
        this.tvshows = tvshows;
    }
}
