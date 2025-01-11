package facade;

import subsystems.*;

public class FacadeInterfaceImpl implements FacadeInterface{

    private final Lights lights;
    private final MusicSystem music;
    private final SecuritySystem security;
    private final SmartBlinds smartBlinds;
    private final Thermostat thermostat;

    public FacadeInterfaceImpl() {
        this.lights = new Lights();
        this.music = new MusicSystem();
        this.security = new SecuritySystem();
        this.smartBlinds = new SmartBlinds();
        this.thermostat = new Thermostat();
    }

    @Override
    public void StartMorningRoutine() {
        System.out.println("Starting morning routine...");
        try{
            System.out.println(lights.turnOnTheLights());
            System.out.println(lights.dimTheLights());
            System.out.println(thermostat.decreaseTheTemperature());
            System.out.println(thermostat.switchToCooling(3));
            System.out.println(music.playMusic());
            System.out.println(smartBlinds.adjustBlinds());
            System.out.println(smartBlinds.openBlinds());
            System.out.println(security.disableCamera());
        } catch(Exception e){
            System.err.println("Something went wrong. Error while starting morning routine: " + e.getMessage());
        }
    }

    @Override
    public void StartNightRoutine() {
        System.out.println("Starting night routine...");
        try{
            System.out.println(lights.turnOffTheLights());
            System.out.println(security.enableCamera());
            System.out.println(music.stopMusic());
            System.out.println(smartBlinds.adjustBlinds());
            System.out.println(smartBlinds.closeBlinds());
            System.out.println(thermostat.increaseTheTemperature());
            System.out.println(thermostat.switchToHeating(2));
        } catch(Exception e){
            System.err.println("Something went wrong. Error while starting night routine: " + e.getMessage());
        }
    }

    @Override
    public void StartLeavingHomeRoutine() {
        System.out.println("Starting leaving home routine...");
        try{
            System.out.println(lights.turnOffTheLights());
            System.out.println(security.enableCamera());
            System.out.println(music.stopMusic());
            System.out.println(smartBlinds.adjustBlinds());
            System.out.println(smartBlinds.closeBlinds());
        } catch(Exception e){
            System.err.println("Something went wrong. Error while starting leaving home routine: " + e.getMessage());
        }
    }
}
