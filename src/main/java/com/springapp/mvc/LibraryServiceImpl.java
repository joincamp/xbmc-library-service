package com.springapp.mvc;

import com.springapp.mvc.model.TVShow;
import com.springapp.mvc.interfaces.LibraryService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jon on 2/3/14.
 */
@Component
public class LibraryServiceImpl implements LibraryService{

    public List<TVShow> fetchTVShows(final List<String> properties) {
        return new ArrayList<TVShow>() {{
            add(new TVShow(properties.toString()));
        }};
    }
}
