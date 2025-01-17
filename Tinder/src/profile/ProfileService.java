package profile;

import pojos.Profile;

import java.util.Map;

public interface ProfileService {
    public void addProfile(Profile profile);
    public void updateProfile(Profile profile);
    public void deleteProfile(Profile profile);
    public Profile getProfile(long id);

    public Map<Long, Profile> getProfiles();
}
