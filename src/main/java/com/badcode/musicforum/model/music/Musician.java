package com.badcode.musicforum.model.music;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Musician {

    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String photo;

    private Date dateOfBirth;

    private Date dateOfDeath;

    private String biography;

    private List<BandMember> bands;
}
