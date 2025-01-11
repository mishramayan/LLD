import facade.FacadeInterface;
import facade.FacadeInterfaceImpl;

public class HomeAutomationSystem {

    public static void main(String[] args) {
        FacadeInterface facade = new FacadeInterfaceImpl();

        facade.StartMorningRoutine();
        System.out.println("\n");
        facade.StartLeavingHomeRoutine();
        System.out.println("\n");
        facade.StartNightRoutine();
    }

}
