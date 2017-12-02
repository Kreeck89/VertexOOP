package autoSalon.dao;

import autoSalon.model.Track;

import java.util.List;

/**
 * getAllTracks() - return all instances of Track from CondDatabase;
 * roll() - can move without car or only that than move car attached to it;
 * stop() - can`t stop if attached car to it is moving;
 */
public interface TrackDAO {

    List<Track> getAllTracks();
    void roll(Track track);
    void stop(Track track);
}
