package com.badcode.musicforum.model.music;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BandMember {

    private Long id;

    private Band band;

    private Musician member;

    private Date memberJoinedBandDate;

    private Date memberLeftBandDate;

    private List<Instrument> instruments;
}
