public class SocialMediaPlatform {
    public static void main(String[] args) {

        User neel = new User("1", "Neel", "neel@example.com");
        User mayan = new User("2", "Mayan", "Mayan@example.com");

        NotificationSystem neelNotification = new NotificationSystem("Neel");
        NotificationSystem mayanNotification = new NotificationSystem("Mayan");

        neel.addObserver(mayanNotification);
        mayan.addObserver(neelNotification);

        neel.createPost("Hello world!");
        mayan.createPost("dsgfahj message!");

    }
}