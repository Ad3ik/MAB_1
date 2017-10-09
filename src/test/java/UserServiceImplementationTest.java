import static org.junit.Assert.*;

public class UserServiceImplementationTest {
    @org.junit.Test
    public void addUser() throws Exception {
        UserServiceImplementation usi = new UserServiceImplementation();
        User u = new User();
        usi.addUser(u);
        User u2 = usi.getUser(u.getUsername());
        assertEquals(u, u2);
    }

    @org.junit.Test
    public void getUser() throws Exception {
        UserServiceImplementation usi = new UserServiceImplementation();
        User u = new User();
        usi.addUser(u);
        User u2 = usi.getUser(u.getUsername());
        assertEquals(u, u2);
    }

    @org.junit.Test
    public void removeUser() throws Exception {
        UserServiceImplementation usi = new UserServiceImplementation();
        User u = new User();
        usi.addUser(u);
        User u2 = usi.getUser(u.getUsername());
        assertEquals(u, u2);
        usi.removeUser(u.getUsername());
        u2 = usi.getUser(u.getUsername());
        assertEquals(null, u2);
    }

    @org.junit.Test
    public void verifyUser() throws Exception {
        UserServiceImplementation usi = new UserServiceImplementation();
        User u = new User();
        u.setPassword("asd");
        usi.addUser(u);
        boolean uVer = usi.verifyUser(u.getUsername(), u.getPassword());
        assertEquals(true, uVer);
        User u2 = new User();
        boolean u2Ver = usi.verifyUser(u2.getUsername(), u2.getPassword());
        assertEquals(false, u2Ver);
    }

}