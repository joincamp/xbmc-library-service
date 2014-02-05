package com.springapp.mvc.dto;

import com.springapp.mvc.model.Episode;
import com.springapp.mvc.model.Limits;

import java.util.List;

/**
 * Created by jcamp on 2/5/14.
 */
public class EpisodesDTO extends AbstractResultDTO{
    List<Episode> episodes;

    public EpisodesDTO(Limits limits, List<Episode> episodes) {
        super(limits);
        this.episodes = episodes;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
