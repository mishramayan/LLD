package pojos;

public class Profile {
    long userId;
    String name;
    String userName;
    String password;
    int age;
    String gender;

    public Profile(long userId, String name, String userName, String password, int age, String gender){
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
