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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "Track")
@Table(name = "tracks", schema = "music")
@Data
public class Track extends AbstractBaseEntity {

    @Column(name = "track_name")
    private String name;

    @Column(name = "track_text")
    private String text;

    @Transient
    private List<Band> authors;

    @ManyToOne
    private Album album;

    @Column(name = "track_length")
    private int lengthInSeconds;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(
            schema = "music",
            name = "tracks_genres",
            joinColumns = {@JoinColumn(name = "tracks_genres_track_id")},
            inverseJoinColumns = {@JoinColumn(name = "tracks_genres_genre_id")}
    )
    private List<Genre> genres;

}
