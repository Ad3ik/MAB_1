public class UserServiceImplementation implements UserService{

    private UserRepositoryImplementation URI;
    public UserServiceImplementation(){
        URI = new UserRepositoryImplementation();
    }

    public void addUser(User user) throws IllegalUsernameException, IncorrectEmailException {
        URI.save(user);

    }

    public User getUser(String username) {

        return URI.findByUsername(username);
    }

    public void removeUser(String username) throws IllegalUsernameException {
        User user2=URI.findByUsername(username);
        URI.remove(user2);
    }

    public boolean verifyUser(String username, String password) {
        User user2=URI.findByUsername(username);
        if(user2!=null&&user2.getPassword()==password){
            return true;

        }
         return false;
    }
}
