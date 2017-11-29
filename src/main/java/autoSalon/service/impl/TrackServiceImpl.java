package autoSalon.service.impl;

import autoSalon.dao.TrackDAO;
import autoSalon.dao.factory.DAOFactory;
import autoSalon.model.Track;
import autoSalon.service.TrackService;

import java.util.List;

public class TrackServiceImpl implements TrackService {
    @Override
    public List<Track> getAllTracks() {
        TrackDAO allTrackMethods = DAOFactory.getAllTrackMethods();
        return allTrackMethods.getAllTracks();
    }

    @Override
    public void roll(Track track) {
        if (track != null) {
            DAOFactory.getAllTrackMethods().roll(track);
        }
    }

    @Override
    public void stop(Track track) {
        if (track != null) {
            DAOFactory.getAllTrackMethods().stop(track);
        }
    }
}
