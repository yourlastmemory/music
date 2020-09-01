package com.badcode.musicforum.service.music;

import com.badcode.musicforum.model.music.Track;
import com.badcode.musicforum.repository.music.TrackRepository;
import com.badcode.musicforum.service.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class TrackService extends AbstractCrudService<Track, UUID> {

    public TrackService(TrackRepository trackRepository) {
        super(trackRepository);
    }

}
