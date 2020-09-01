package com.badcode.musicforum.service.music;

import com.badcode.musicforum.model.music.Band;
import com.badcode.musicforum.model.music.BandMember;
import com.badcode.musicforum.model.music.Musician;
import com.badcode.musicforum.repository.music.BandMemberRepository;
import com.badcode.musicforum.service.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class BandMemberService extends AbstractCrudService<BandMember, UUID> {

    public BandMemberService(BandMemberRepository bandMemberRepository) {
        super(bandMemberRepository);
    }

    public List<BandMember> findBandMembersByBand(Band band) {
        return ((BandMemberRepository) repository).findBandMembersByBand(band);
    }

    public List<BandMember> findBandMembersByMember(Musician musician) {
        return ((BandMemberRepository) repository).findBandMembersByMember(musician);
    }
}
