package profile;

import pojos.Profile;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProfileServiceImpl implements ProfileService {

    private static ProfileServiceImpl instance;
    private final Map<Long, Profile> profiles = new ConcurrentHashMap<>();

    private ProfileServiceImpl() {}

    public static ProfileServiceImpl getInstance() {
        if (instance == null) {
            instance = new ProfileServiceImpl();
        }
        return instance;
    }

    @Override
    public void addProfile(Profile profile) {
        if (profiles.putIfAbsent(profile.getUserId(), profile) == null) {
            System.out.println("Added profile for user " + profile.getUserId());
        } else {
            System.out.println("Profile already exists for user " + profile.getUserId());
        }
    }

    @Override
    public void updateProfile(Profile profile) {
        if (profiles.replace(profile.getUserId(), profile) != null) {
            System.out.println("Updated profile for user " + profile.getUserId());
        } else {
            System.out.println("No existing profile found for user " + profile.getUserId());
        }
    }

    @Override
    public void deleteProfile(Profile profile) {
        if (profiles.remove(profile.getUserId()) != null) {
            System.out.println("Deleted profile for user " + profile.getUserId());
        } else {
            System.out.println("No profile found for user " + profile.getUserId());
        }
    }

    @Override
    public Profile getProfile(long id) {
        return profiles.get(id);
    }

    @Override
    public Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
