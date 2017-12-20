package homeTaskFromLists.pack11.trafficLight;

public enum EnumTraffColor {

    GREEN, YELLOW, RED;

    public void getNextColor(TrafficLight trafficLight) {
        if (trafficLight.getPrev().equals(GREEN.toString()) & trafficLight.getNow().equals(YELLOW.toString())) {
            trafficLight.setPrev(YELLOW.toString());
            trafficLight.setNow(RED.toString());
        } else if (trafficLight.getPrev().equals(YELLOW.toString()) & trafficLight.getNow().equals(RED.toString())) {
            trafficLight.setPrev(RED.toString());
            trafficLight.setNow(YELLOW.toString());
        } else if (trafficLight.getPrev().equals(RED.toString()) & trafficLight.getNow().equals(YELLOW.toString())) {
            trafficLight.setPrev(YELLOW.toString());
            trafficLight.setNow(GREEN.toString());
        } else if (trafficLight.getPrev().equals(YELLOW.toString()) & trafficLight.getNow().equals(GREEN.toString())) {
            trafficLight.setPrev(GREEN.toString());
            trafficLight.setNow(YELLOW.toString());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
