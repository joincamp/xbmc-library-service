package com.springapp.mvc.model;

import org.hibernate.annotations.Subselect;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Subselect("select idSeason, idShow, c12 as season, coalesce(sum(playcount),0) as totalplayed, strTitle FROM episodeview group by c12, strTitle, idShow")
public class Season {
    @Id
    @Column(name = "idSeason")
    private Integer seasonid;


    @Column(name = "idShow")
    private Integer tvshowid;

/*
    @Column(name = "c06")
    private String thumbnail;
*/

    @Column(name = "season")
    private String season;

    @Column(name = "strTitle")
    private String showtitle;

    //TODO: dafault to 0 if null
    @Column(name = "totalplayed")
    private Integer playcount;

    @Transient
    private String label;
}
