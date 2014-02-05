package com.springapp.mvc.model;

/**
 * Created by jon on 2/3/14.
 */
public class TVShow {

    private Integer id;
    private String title;
    private String plot;
    private String rating;
    private String genre;
    private String fanart;
    private String thumbnail;
    private String mpaa;
    private String studio;
    private String playcount;
    private String premiered;
    private String episode;

    public TVShow(String title, String plot,
                  String rating, String genre,
                  String fanart, String thumbnail,
                  String mpaa, String studio,
                  String playcount, String premiered, String episode) {
        this.title = title;
        this.plot = plot;
        this.rating = rating;
        this.genre = genre;
        this.fanart = fanart;
        this.thumbnail = thumbnail;
        this.mpaa = mpaa;
        this.studio = studio;
        this.playcount = playcount;
        this.premiered = premiered;
        this.episode = episode;
    }

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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
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

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }
}
