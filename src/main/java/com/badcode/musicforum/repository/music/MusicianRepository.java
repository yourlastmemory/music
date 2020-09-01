package com.badcode.musicforum.repository.music;

import com.badcode.musicforum.model.music.Musician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, UUID> {

}
