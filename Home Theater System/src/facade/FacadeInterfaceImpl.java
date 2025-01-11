package facade;

import system.*;

public class FacadeInterfaceImpl implements FacadeInterface {

    private final PopcornMachine popcornMachine;
    private final Lights lights;
    private final Screen screen;
    private final Projector projector;
    private final Amplifier amplifier;
    private final DVDPlayer dvdPlayer;
    private final Movie movie;

    public FacadeInterfaceImpl() {
        this.popcornMachine = new PopcornMachine();
        this.lights = new Lights();
        this.screen = new Screen();
        this.projector = new Projector();
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DVDPlayer();
        this.movie = new Movie();
    }

    @Override
    public void startMovie() {
        System.out.println("Starting movie...");
        try {
            System.out.println(popcornMachine.turnOnPopcornMachine());
            System.out.println(lights.dimTheLights());
            System.out.println(screen.lowerTheScreen());
            System.out.println(projector.turnOnProjector());
            System.out.println(amplifier.turnUpTheVolume());
            System.out.println(dvdPlayer.turnOnDVDPlayer());
            System.out.println(movie.playMovie());
        } catch (Exception e) {
            System.err.println("Error while starting movie: " + e.getMessage());
        }
    }

    @Override
    public void stopMovie() {
        System.out.println("Stopping movie...");
        try {
            System.out.println(movie.stopMovie());
            System.out.println(dvdPlayer.turnOffDVDPlayer());
            System.out.println(projector.turnOffProjector());
            System.out.println(amplifier.turnDownTheVolume());
            System.out.println(screen.raiseTheScreen());
            System.out.println(lights.brightenTheLights());
            System.out.println(popcornMachine.turnOffPopcornMachine());
        } catch (Exception e) {
            System.err.println("Error while stopping movie: " + e.getMessage());
        }
    }

    @Override
    public void pauseMovie() {
        System.out.println("Pausing movie...");
        try {
            System.out.println(movie.pauseMovie());
        } catch (Exception e) {
            System.err.println("Error while pausing movie: " + e.getMessage());
        }
    }
}
