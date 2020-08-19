package com.badcode.musicforum.model.music;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Band {

    private Long id;

    private String name;

    private String photo;

    private String country;

    private String city;

    private Date bandFormed;

    private Date disband;

    private List<BandMember> bandMembers;

    private List<Album> albums;

    private List<Track> singles;
}
