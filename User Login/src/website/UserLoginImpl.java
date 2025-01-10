package website;

import user.User;

import java.util.*;

public class UserLoginImpl implements UserLogin{

    Deque<User> userQueue = new ArrayDeque<User>();
    Map<User, Integer> userFreqMap = new HashMap<User, Integer>();

    @Override
    public void newUserLogin(String username) {
        User user = new User(username);
        userQueue.addLast(user);
        userFreqMap.put(user, userFreqMap.getOrDefault(user, 0)+1);
    }

    @Override
    public void getOldestOneTimeVisitingUser() {
        if (userQueue.isEmpty()) {
            System.out.println("No users have logged in yet.");
            return;
        }

        for (User user : userQueue) {
            if (userFreqMap.get(user) == 1) {
                System.out.println("The oldest one time visiting user: " + user.getUsername());
                return;
            }
        }
        System.out.println("No one-time visiting users.");
    }
}
