package homeTaskFromLists.pack5;

public class Track {

    private String number;
    private Doing status = Doing.STOP;

    public Track(String number, Doing status) {
        if (status == Doing.STOP | status == Doing.ROLL) {
            this.number = number;
            this.status = status;
        }
    }

    public Track() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Doing getStatus() {
        return status;
    }

    public void setStatus(Doing status) {
        if (status == Doing.STOP | status == Doing.ROLL) {
            this.status = status;
        }
    }

    public enum Doing {
        STOP,
        ROLL
    }

}
