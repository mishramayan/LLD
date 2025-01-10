import website.UserLogin;
import website.UserLoginImpl;

public class Application {
    public static void main(String[] args){
        UserLogin users = new UserLoginImpl();

        users.newUserLogin("mayan8895");
        users.newUserLogin("neelesh0995");
        users.newUserLogin("mayan8895");
        users.newUserLogin("neelesh0995");
        users.newUserLogin("gouravb");
        users.newUserLogin("gouravb");

        users.getOldestOneTimeVisitingUser();
    }
}
