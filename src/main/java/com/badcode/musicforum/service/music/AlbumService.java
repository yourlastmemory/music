package com.badcode.musicforum.service.music;


import com.badcode.musicforum.model.music.Album;
import com.badcode.musicforum.repository.music.AlbumRepository;
import com.badcode.musicforum.service.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class AlbumService extends AbstractCrudService<Album, UUID> {

    protected AlbumService(AlbumRepository repository) {
        super(repository);
    }
}
