package com.badcode.musicforum.model.music;

import com.badcode.musicforum.model.domain.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "Musician")
@Table(name = "musicians", schema = "music")
@Data
public class Musician extends AbstractBaseEntity {

    @Column(name = "musician_first_name")
    private String firstName;

    @Column(name = "musician_middle_name")
    private String middleName;

    @Column(name = "musician_last_name")
    private String lastName;

    @Column(name = "musician_photo")
    private String photo;

    @Column(name = "musician_date_of_birth")
    private Date dateOfBirth;

    @Column(name = "musician_date_of_death")
    private Date dateOfDeath;

    @Column(name = "musician_biography")
    private String biography;

    @Column(name = "musician_country")
    private String country;

    @Column(name = "musician_city")
    private String city;

    @Enumerated(EnumType.STRING)
    @Column(name = "musician_gender")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "musician_voice_type")
    private VoiceType voiceType;

    @OneToMany(mappedBy = "musicians", fetch = FetchType.LAZY)
    private List<BandMember> bands;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "musicians_vocal_styles",
            schema = "music",
            joinColumns = {@JoinColumn(name = "musicians_vocal_styles_musician")},
            inverseJoinColumns = {@JoinColumn(name = "musicians_vocal_styles_style")}
    )
    private List<VocalStyle> vocalStyles;

    public void setVoiceType(VoiceType voiceType) {
        if (null != this.gender
                && !this.gender.equals(voiceType.getGender())) {
            this.voiceType = VoiceType.getNearestVoiceType(this.gender);
        }
        this.voiceType = voiceType;
    }
}
