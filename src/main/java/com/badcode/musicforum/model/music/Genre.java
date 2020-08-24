package com.badcode.musicforum.model.music;

import com.badcode.musicforum.model.domain.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "Genre")
@Table(name = "genres", schema = "music")
@Data
public class Genre extends AbstractBaseEntity {

    @Column(name = "genre_name")
    private String name;

    @Column(name = "genre_description")
    private String description;

    @Column(name = "genre_origin_year")
    private int beganYear;

    @Column(name = "genre_origin_country")
    private String originCountry;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "genres_relations",
            schema = "music",
            joinColumns = {@JoinColumn(name = "genres_relations_super_genre_id")},
            inverseJoinColumns = {@JoinColumn(name = "genres_relations_sub_genre_id")}
    )
    private List<Genre> superGenres;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "genres_relations",
            schema = "music",
            joinColumns = {@JoinColumn(name = "genres_relations_sub_genre_id")},
            inverseJoinColumns = {@JoinColumn(name = "genres_relations_super_genre_id")}
    )
    private List<Genre> subGenres;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "tracks_genres",
            schema = "music",
            joinColumns = {@JoinColumn(name = "tracks_genres_genre_id")},
            inverseJoinColumns = {@JoinColumn(name = "tracks_genres_track_id")}
    )
    private List<Track> tracks;
}
