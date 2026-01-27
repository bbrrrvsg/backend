package DAY06.Practice8;

public class Lamp {

    boolean isOn = false;

    void turnOn(){
        isOn = true;
    }
    void turnOff(){
        isOn = false;
    }
    void printIs(){
        System.out.println(isOn);
    }
}
