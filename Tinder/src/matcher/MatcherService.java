package matcher;

import pojos.Profile;
import profile.ProfileService;

import java.util.List;

public interface MatcherService {
    public void findMatches(Profile user);
}
