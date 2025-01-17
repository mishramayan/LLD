package matcher;

import pojos.Profile;
import profile.ProfileService;
import profile.ProfileServiceImpl;
import java.util.Map;

public class MatcherServiceImpl implements MatcherService {

    ProfileService profileService = ProfileServiceImpl.getInstance();
    Map<Long, Profile> profiles = profileService.getProfiles();

    @Override
    public void findMatches(Profile user) {
        if (user == null) {
            System.out.println("User profile is null. Cannot find matches.");
            return;
        }

        System.out.println("Finding matches for user: " + user.getName());
        System.out.println("Available profiles: " + profiles);

        boolean matchFound = profiles.values().stream()
                .filter(profile -> profile.getUserId() != user.getUserId())
                .filter(profile -> !profile.getGender().equalsIgnoreCase(user.getGender()))
                .peek(match -> System.out.println(user.getName() + " matched with " + match.getName()))
                .findFirst()
                .isPresent();

        if (!matchFound) {
            System.out.println("No matches found for user: " + user.getName());
        }

        System.out.println("Match finding completed.");
    }
}