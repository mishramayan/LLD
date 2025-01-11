package subsystems;

import java.time.LocalDateTime;

public class Thermostat {

    public String increaseTheTemperature(){
        return "Increase the temperature";
    }

    public String decreaseTheTemperature(){
        return "Decrease the temperature";
    }

    public String switchToHeating(int hours){
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime shut = time.plusHours(hours);
        return "Switched to heating for next " + hours + " hours. Begin at " + time + " stops at " + shut;
    }

    public String switchToCooling(int hours){
        LocalDateTime time = LocalDateTime.now();
        LocalDateTime shut = time.plusHours(hours);
        return "Switched to cooling for next " + hours + " hours. Begin at " + time + " stops at " + shut;
    }

}
