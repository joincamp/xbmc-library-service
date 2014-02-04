package com.springapp.mvc;

import Models.TVShow;
import com.springapp.mvc.interfaces.LibraryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jon on 2/3/14.
 */
public class LibraryServiceImpl implements LibraryService{
    @Override
    public List<TVShow> fetchTVShows() {
        return new ArrayList<TVShow>() {{
            add(new TVShow("test"));
        }};
    }
}
