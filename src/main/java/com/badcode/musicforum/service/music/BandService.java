package com.badcode.musicforum.service.music;

import com.badcode.musicforum.model.music.Band;
import com.badcode.musicforum.repository.music.BandRepository;
import com.badcode.musicforum.service.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class BandService extends AbstractCrudService<Band, UUID> {

    protected BandService(BandRepository repository) {
        super(repository);
    }
}
