package com.badcode.musicforum.model.music;

import lombok.Data;

import java.util.List;

@Data
public class Genre {

    private Long id;

    private String name;

    private String description;

    private int beganYear;

    private String originCountry;

    private List<Genre> superGenres;

    private List<Genre> subGenres;
}
