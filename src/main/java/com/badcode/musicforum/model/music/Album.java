package com.badcode.musicforum.model.music;

import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Album {

    private Long id;

    private Long name;

    private String cover;

    private Band authors;

    private Date released;

    private String description;

    private AlbumType type;

    private List<Track> trackList;

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
