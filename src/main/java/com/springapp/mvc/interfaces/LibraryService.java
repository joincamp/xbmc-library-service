package com.springapp.mvc.interfaces;

import Models.TVShow;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jon on 2/3/14.
 */

@RequestMapping("/jsonrpc")
public interface LibraryService {
    List<TVShow> fetchTVShows();
}
