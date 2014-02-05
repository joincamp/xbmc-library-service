package com.springapp.mvc.service;

import com.springapp.mvc.dto.EpisodesDTO;
import com.springapp.mvc.dto.SeasonsDTO;
import com.springapp.mvc.dto.TVShowsDTO;
import com.springapp.mvc.model.TVShow;
import com.googlecode.jsonrpc4j.JsonRpcMethod;
import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.List;

@JsonRpcService("/jsonrpc")
public interface LibraryService {
    @JsonRpcMethod("VideoLibrary.GetTVShows")
    TVShowsDTO fetchTVShows(@JsonRpcParam("properties") final List<String> properties);

    @JsonRpcMethod("VideoLibrary.GetEpisodes")
    EpisodesDTO fetchEpisodes(@JsonRpcParam("properties") final List<String> properties);

    @JsonRpcMethod("VideoLibrary.GetSeasons")
    SeasonsDTO fetchSeasons(@JsonRpcParam("properties") final List<String> properties);
}
