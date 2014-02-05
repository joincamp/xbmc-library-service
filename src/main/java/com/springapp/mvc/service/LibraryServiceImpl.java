package com.springapp.mvc.service;

import com.springapp.mvc.dao.EpisodeDao;
import com.springapp.mvc.dao.TVShowDao;
import com.springapp.mvc.dto.EpisodesDTO;
import com.springapp.mvc.dto.TVShowsDTO;
import com.springapp.mvc.model.Episode;
import com.springapp.mvc.model.Limits;
import com.springapp.mvc.model.TVShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jon on 2/3/14.
 */
@Service("libraryService")
@Transactional(readOnly = true)
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    private TVShowDao tvshowRepository;

    @Autowired
    private EpisodeDao episodeRepository;

    public TVShowsDTO fetchTVShows(final List<String> properties) {
        List<TVShow> shows = tvshowRepository.getAllTVShows();
        Limits limits = new Limits(0, shows.size(), shows.size());
        return new TVShowsDTO(limits,shows);
    }

    public EpisodesDTO fetchEpisodes(final List<String> properties) {
        List<Episode> episodes = episodeRepository.getAllEpisodes();
        Limits limits = new Limits(0, episodes.size(), episodes.size());
        return new EpisodesDTO(limits,episodes);
    }
}
