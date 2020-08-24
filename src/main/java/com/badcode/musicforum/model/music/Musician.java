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

    private String country;

    private String city;

    private Gender gender;

    private VoiceType voiceType;

    private List<BandMember> bands;

    private List<VocalStyle> vocalStyles;

    public void setVoiceType(VoiceType voiceType) {
        if (null != this.gender
                && !this.gender.equals(voiceType.getGender())) {
            this.voiceType = VoiceType.getNearestVoiceType(this.gender);
        }
        this.voiceType = voiceType;
    }
}
