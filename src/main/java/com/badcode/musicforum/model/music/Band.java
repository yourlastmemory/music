package com.badcode.musicforum.model.music;

import com.badcode.musicforum.model.domain.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Entity(name = "Band")
@Table(name = "bands", schema = "music")
@Data
public class Band extends AbstractBaseEntity {

    @Column(name = "band_name")
    private String name;

    @Column(name = "band_photo")
    private String photo;

    @Column(name = "band_country")
    private String country;

    @Column(name = "band_city")
    private String city;

    @Column(name = "band_formed_date")
    private Date bandFormed;

    @Column(name = "band_disband_date")
    private Date disband;

    @OneToMany(mappedBy = "bands", fetch = FetchType.LAZY)
    private List<BandMember> bandMembers;

    @OneToMany(mappedBy = "bands")
    private List<Album> albums;

//    private List<Track> singles;
}
