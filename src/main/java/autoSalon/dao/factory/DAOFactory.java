package autoSalon.dao.factory;

import autoSalon.dao.CarDAO;
import autoSalon.dao.TrackDAO;
import autoSalon.dao.impl.CarDAOImpl;
import autoSalon.dao.impl.TrackDAOImpl;

/**
 * Some pattern for easy work with Cars, Tracks and its CondDatabase.
 */
public class DAOFactory {

    /**
     * @return instance of {@link CarDAO}
     */
    public static CarDAO getAllCarMethods() {
        return new CarDAOImpl();
    }

    /**
     * @return instance of {@link TrackDAO}
     */
    public static TrackDAO getAllTrackMethods() {
        return new TrackDAOImpl();
    }
}
