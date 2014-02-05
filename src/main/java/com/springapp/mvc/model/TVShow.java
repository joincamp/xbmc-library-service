package com.springapp.mvc.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by jon on 2/3/14.
 */
@Entity
@Table(name = "tvshowview")
public class TVShow {

    /**
     *
     * Example output result from :
     *
     {"jsonrpc":"2.0",
     "method": "VideoLibrary.GetTVShows",
     "params": { "properties": ["title", "plot", "genre", "fanart", "thumbnail", "rating", "mpaa", "studio", "playcount", "premiered", "episode"] },
     "id":1
     }

    {
     "episode": 2,
     "fanart": "image://http%3a%2f%2fthetvdb.com%2fbanners%2ffanart%2foriginal%2f78956-12.jpg/",
     "genre": [
     "Reality"
     ],
     "label": "So You Think You Can Dance",
     "mpaa": "TV-PG",
     "playcount": 0,
     "plot": "The summer hit SO YOU THINK YOU CAN DANCE, hosted by Cat Deeley, keeps viewers moving to a different beat as dancers skilled in everything from the 'street' styles of Hip-Hop, Krumping and Popping to Ballroom's Salsa, Quickstep and Jive compete to be named the nation's favorite.\r\n\r\nIn the performance round, the 20 finalists dance for America's votes, and each week the six contestants comprising the bottom three couples are given a chance to perform solo routines to encourage viewers to keep them on the show. Then the judges decide which dancers stay in the competition and which two are eliminated.",
     "premiered": "2005-07-20",
     "rating": 8.100000381469727,
     "studio": [
     "FOX"
     ],
     "thumbnail": "image://http%3a%2f%2fthetvdb.com%2fbanners%2fposters%2f78956-1.jpg/",
     "title": "So You Think You Can Dance",
     "tvshowid": 2
     }
     *
     */

    @Id
    @Column(name = "idShow")
    private Integer id;

    @Column(name = "c00")
    private String title;

    @Column(name = "c01")
    private String plot;

    @Column(name = "c04")
    private BigDecimal rating;

    //TODO: split on '/'. ie. 'Action / Drama' -> ['Action','Drama']. Return List instead of String
    @Column(name = "c08")
    private String genre;

    //TODO: return url only?
    @Column(name = "c11")
    private String fanart;

    //TODO: return url only?
    @Column(name = "c06")
    private String thumbnail;

    @Column(name = "c13")
    private String mpaa;

    //TODO: split on '/'? ie. 'Century / FOX' -> ['Century','FOX']. Return List instead of String
    @Column(name = "c14")
    private String studio;

    //TODO: dafault to 0 if null
    @Column(name = "watchedcount")
    private String playcount;

    @Column(name = "c05")
    @Temporal(TemporalType.DATE)
    private Date premiered;

    @Column(name = "totalCount")
    private String episode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFanart() {
        return fanart;
    }

    public void setFanart(String fanart) {
        this.fanart = fanart;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getMpaa() {
        return mpaa;
    }

    public void setMpaa(String mpaa) {
        this.mpaa = mpaa;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getPlaycount() {
        return playcount;
    }

    public void setPlaycount(String playcount) {
        this.playcount = playcount;
    }

    public Date getPremiered() {
        return premiered;
    }

    public void setPremiered(Date premiered) {
        this.premiered = premiered;
    }
}
