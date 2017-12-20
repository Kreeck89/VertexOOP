package homeTaskFromLists.pack11.trafficLight;

/**
 * Tasks from lists, page 67(Task 2).
 * Work with Enum a Delegate.
 */
public class MainTrafficLight {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 10; i++) {
            trafficLight.changeColor(trafficLight);
            System.out.println(trafficLight.getNow());
        }
    }
}
