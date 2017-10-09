public interface UserRepository {
    public User findByUsername(String username);
    public void save(User user1);
    public void remove(User user1);
}
