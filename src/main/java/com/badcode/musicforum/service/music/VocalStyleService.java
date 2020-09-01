package com.badcode.musicforum.service.music;

import com.badcode.musicforum.model.music.VocalStyle;
import com.badcode.musicforum.repository.music.VocalStyleRepository;
import com.badcode.musicforum.service.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class VocalStyleService extends AbstractCrudService<VocalStyle, UUID> {

    public VocalStyleService(VocalStyleRepository vocalStyleRepository) {
        super(vocalStyleRepository);
    }
}
