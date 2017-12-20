package homeTaskFromLists.pack11.trafficLight;

import lombok.*;

@Data
@Getter
@Setter
public class TrafficLight {

    private String prev;
    private String now;

    public TrafficLight() {
        prev = EnumTraffColor.YELLOW.toString();
        now = EnumTraffColor.GREEN.toString();
    }

    public void changeColor(TrafficLight trafficLight) {
        EnumTraffColor.GREEN.getNextColor(trafficLight);
    }
}
