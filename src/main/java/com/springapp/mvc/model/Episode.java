package com.springapp.mvc.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "episodeview")
public class Episode {

    /**
    Example result from:

    {"jsonrpc":"2.0",
     "method": "VideoLibrary.GetEpisodes",
     "params": { "properties": ["title", "plot", "season", "episode", "showtitle", "tvshowid", "fanart", "thumbnail", "rating", "playcount", "firstaired"] },
     "id":1
    }

     * --> needs work
     - --> mapped

-    "episode": 2,
-    "episodeid": 1,
*    "fanart": "image://http%3a%2f%2fthetvdb.com%2fbanners%2ffanart%2foriginal%2f257939-1.jpg/",
-    "firstaired": "2013-06-30",
*    "label": "2x02. Aileen Aroon",
*    "playcount": 1,
-    "plot": "As more corpses of young men are found and others continue to disappear, Corcoran leaves no stone unturned in his search for answers. General Brendan Donovan employs unseemly tactics to keep the murders out of the press. Meanwhile, as Sara readies herself to attend a dinner with Frederick Douglass at the Morehouse mansion, Doctor Matthew Freeman makes a drastic decision for the health of his community – forcing her to confront her past. With his fate decided, Maguire must fend for himself and realign his allegiances.",
-    "rating": 8,
-    "season": 2,
-    "showtitle": "Copper",
*    "thumbnail": "image://http%3a%2f%2fthetvdb.com%2fbanners%2fepisodes%2f257939%2f4598686.jpg/",
-    "title": "Aileen Aroon",
-    "tvshowid": 1
    **/

    @Id
    @Column(name = "idEpisode")
    private Integer episodeid;

    @Column(name = "c13")
    private Integer episode;

    @Column(name = "c00")
    private String title;

    @Column(name = "c01")
    private String plot;

    @Column(name = "c03")
    private BigDecimal rating;

    @Column(name = "c05")
    private String firstaired;

    @Column(name = "idShow")
    private Integer tvshowid;

    @Column(name = "c06")
    private String thumbnail;

    @Column(name = "c12")
    private String season;

    //TODO: dafault to 0 if null
    @Column(name = "playCount")
    private Integer playcount;

    @Transient
    private String fanart;

    @Transient
    private String label;

    public Integer getEpisodeid() {
        return episodeid;
    }

    public void setEpisodeid(Integer episodeid) {
        this.episodeid = episodeid;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getFirstaired() {
        return firstaired;
    }

    public void setFirstaired(String firstaired) {
        this.firstaired = firstaired;
    }

    public Integer getTvshowid() {
        return tvshowid;
    }

    public void setTvshowid(Integer tvshowid) {
        this.tvshowid = tvshowid;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }
}
