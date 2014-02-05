package com.springapp.mvc.interfaces;

import com.springapp.mvc.model.TVShow;
import com.googlecode.jsonrpc4j.JsonRpcMethod;
import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.List;

/**
 * Created by jon on 2/3/14.
 */

@JsonRpcService("/jsonrpc")
public interface LibraryService {
    @JsonRpcMethod("VideoLibrary.GetTVShows")
    List<TVShow> fetchTVShows(@JsonRpcParam("properties") final List<String> properties);
}
