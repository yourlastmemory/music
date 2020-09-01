package com.badcode.musicforum.service.music;

import com.badcode.musicforum.model.music.Genre;
import com.badcode.musicforum.repository.music.GenreRepository;
import com.badcode.musicforum.service.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class GenreService extends AbstractCrudService<Genre, UUID> {

    protected GenreService(GenreRepository repository) {
        super(repository);
    }

    public List<Genre> findAllBySuperGenresContains(Genre superGenre) {
        return ((GenreRepository) repository).findAllBySuperGenresContains(superGenre);
    }

    public List<Genre> findAllBySubGenresContains(Genre subGenre) {
        return ((GenreRepository) repository).findAllBySubGenresContains(subGenre);
    }

}
