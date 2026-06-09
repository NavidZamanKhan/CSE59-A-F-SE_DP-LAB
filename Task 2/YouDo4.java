class Sensor {
    String name;
    int batteryLevel;
    
    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        
        sensor.charge();
        
        System.out.println("Battery Level: " + sensor.batteryLevel);
    }
}
