package com.springapp.mvc.dto;

import com.springapp.mvc.model.Episode;
import com.springapp.mvc.model.Limits;
import com.springapp.mvc.model.Season;

import java.util.List;

public class SeasonsDTO extends AbstractResultDTO {
    List<Season> seasons;

    public SeasonsDTO(Limits limits, List<Season> seasons) {
        super(limits);
        this.seasons = seasons;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
