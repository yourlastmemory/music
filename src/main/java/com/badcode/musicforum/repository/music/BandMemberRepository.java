package com.badcode.musicforum.repository.music;

import com.badcode.musicforum.model.music.Band;
import com.badcode.musicforum.model.music.BandMember;
import com.badcode.musicforum.model.music.Musician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BandMemberRepository extends JpaRepository<BandMember, UUID> {

    List<BandMember> findBandMembersByBand(Band band);

    List<BandMember> findBandMembersByMember(Musician musician);

}
