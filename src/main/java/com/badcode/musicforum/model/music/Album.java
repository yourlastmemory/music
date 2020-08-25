package com.badcode.musicforum.model.music;

import com.badcode.musicforum.model.domain.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "Album")
@Table(name = "albums", schema = "music")
@Data
public class Album extends AbstractBaseEntity {

    @Column(name = "album_name")
    private Long name;

    @Column(name = "album_cover")
    private String cover;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id", nullable = false)
    private Band authors;

    @Column(name = "album_release_date")
    private Date released;

    @Column(name = "album_description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "album_type")
    private AlbumType type;

    @Transient
    private @Nullable
    List<Track> trackList;

    public boolean isEP() {
        return AlbumType.EP.equals(type);
    }

    public boolean isFullAlbum() {
        return AlbumType.FULL_ALBUM.equals(type);
    }

    public boolean isDemo() {
        return AlbumType.DEMO.equals(type);
    }

    public Set<Genre> getGenres() {
        Set<Genre> genres = new HashSet<>();
        trackList.forEach(track -> genres.addAll(track.getGenres()));
        return genres;
    }
}
