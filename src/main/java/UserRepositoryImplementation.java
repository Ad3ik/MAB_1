import java.util.ArrayList;

public class UserRepositoryImplementation implements UserRepository {
    private ArrayList <User> UserList;

    public UserRepositoryImplementation(){
        UserList = new ArrayList<User>();
    }

    public User findByUsername(String username) {
        for (User u :UserList)
            if (u.getUsername() == username) {
                return u;
            }
        return null;
    }

    public void save(User user1) {
        UserList.add(user1);

    }

    public void remove(User user1) {
        UserList.remove(user1);
    }


}
