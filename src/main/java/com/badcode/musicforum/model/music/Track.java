package com.badcode.musicforum.model.music;

import lombok.Data;

import java.util.List;

@Data
public class Track {

    private Long id;

    private String name;

    private List<Band> authors;

    private Album album;

    private int lengthInSeconds;

    private List<Genre> genres;

}
