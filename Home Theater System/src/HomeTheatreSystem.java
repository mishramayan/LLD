import facade.FacadeInterface;
import facade.FacadeInterfaceImpl;

public class HomeTheatreSystem {
    public static void main(String[] args) {
        FacadeInterface facade = new FacadeInterfaceImpl();

        facade.startMovie();
        System.out.println("\n");
        facade.pauseMovie();
        System.out.println("\n");
        facade.stopMovie();
    }
}
