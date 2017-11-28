package homeTaskFromLists.pack5;

/**
 * Tasks from lists, page 34 (Task 2).
 *
 */
public class MainTrack {

    public static void main(String[] args) {

        Track track1 = new Track();
        Track track2 = new Track("AA111VV", Track.Doing.STOP);

        roll(track1);
        roll(track2);
        roll(track1);
        stop(track1);
        stop(track2);
        stop(track2);

    }

    private static void roll(Track track) {
        if (track.getStatus().equals(Track.Doing.STOP)) {
            track.setStatus(Track.Doing.ROLL);
            System.out.println("You changed your Track status on ROLL.");
        } else {
            System.out.println("Your track is rolling now!");
        }
    }

    private static void stop(Track track) {
        if (track.getStatus().equals(Track.Doing.ROLL)) {
            track.setStatus(Track.Doing.STOP);
            System.out.println("You changed your Track status on STOP.");
        } else {
            System.out.println("Your track is stop now!");
        }
    }
}
