package work;

/**
 * Created by hp on 2019/3/4.
 */
public class UserLogin {
    private  User user;

    public UserLogin(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "user=" + user +
                '}';
    }

    public UserLogin() {
    }

}
