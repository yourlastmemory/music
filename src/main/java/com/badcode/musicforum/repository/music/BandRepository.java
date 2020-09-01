package com.badcode.musicforum.repository.music;

import com.badcode.musicforum.model.music.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BandRepository extends JpaRepository<Band, UUID> {

}
