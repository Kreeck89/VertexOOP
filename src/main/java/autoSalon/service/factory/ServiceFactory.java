package autoSalon.service.factory;

import autoSalon.service.CarService;
import autoSalon.service.TrackService;
import autoSalon.service.impl.CarServiceImpl;
import autoSalon.service.impl.TrackServiceImpl;

/**
 * Pattern for easy work with Cars and Tracks.
 */
public class ServiceFactory {

    /**
     * @return instance of {@link CarService}
     */
    public static CarService getAllCarMethods() {
        return new CarServiceImpl();
    }

    /**
     * @return instance of {@link TrackService}
     */
    public static TrackService getAllTrackMethods() {
        return new TrackServiceImpl();
    }
}
