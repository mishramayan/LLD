import imageService.ImageService;
import imageService.ImageServiceImpl;
import matcher.MatcherService;
import matcher.MatcherServiceImpl;
import pojos.Profile;
import profile.ProfileService;
import profile.ProfileServiceImpl;

public class TinderApp {

    public static void main(String[] args) {
        ProfileService profileService = ProfileServiceImpl.getInstance();
        ImageService imageService = new ImageServiceImpl();
        MatcherService matcherService = new MatcherServiceImpl();

        profileService.addProfile(new Profile(1234, "John", "j-on", "pass1234", 24, "Male"));
        profileService.addProfile(new Profile(5678, "Katy", "katy", "pass5678", 21, "Female"));

        imageService.loadImage(1234, 1);
        imageService.loadImage(1234, 2);
        imageService.getImage(1234, 1);

        matcherService.findMatches(profileService.getProfile(1234));
    }
}
