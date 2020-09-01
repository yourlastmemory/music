package com.badcode.musicforum.service.music;

import com.badcode.musicforum.model.music.Musician;
import com.badcode.musicforum.repository.music.MusicianRepository;
import com.badcode.musicforum.service.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class MusicianService extends AbstractCrudService<Musician, UUID> {

    protected MusicianService(MusicianRepository repository) {
        super(repository);
    }
}
