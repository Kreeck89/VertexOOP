package autoSalon.service;

import autoSalon.model.Track;

import java.util.List;

/**
 * All methods described in TrackDAO.
 */
public interface TrackService {

    List<Track> getAllTracks();
    void roll(Track track);
    void stop(Track track);
}
