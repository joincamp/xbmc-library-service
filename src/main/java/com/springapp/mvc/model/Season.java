package com.springapp.mvc.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "episodeview")
public class Season {
    @Column(name = "c13")
    private Integer episode;

    @Column(name = "idShow")
    private Integer tvshowid;

    @Column(name = "c06")
    private String thumbnail;

    @Column(name = "c12")
    private String season;

    private String showtitle;

    //TODO: dafault to 0 if null
    @Column(name = "playCount")
    private Integer playcount;

    private String label;
}
