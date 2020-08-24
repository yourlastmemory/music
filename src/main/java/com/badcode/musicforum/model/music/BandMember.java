package com.badcode.musicforum.model.music;

import com.badcode.musicforum.model.domain.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "Band")
@Table(name = "bands_members", schema = "music")
@Data
public class BandMember extends AbstractBaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Band band;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Musician member;

    @Column(name = "band_member_joined_date")
    private Date memberJoinedBandDate;

    @Column(name = "band_member_left_date")
    private Date memberLeftBandDate;

    //todo implement tables and logic for instruments
    @Transient
    private List<Instrument> instruments;
}
