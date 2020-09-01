package com.badcode.musicforum.repository.music;

import com.badcode.musicforum.model.music.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GenreRepository extends JpaRepository<Genre, UUID> {


    List<Genre> findAllBySuperGenresContains(Genre superGenre);

    List<Genre> findAllBySubGenresContains(Genre subGenre);
}
