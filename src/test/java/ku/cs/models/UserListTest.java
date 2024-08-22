package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    private UserList userList;

    @BeforeEach
    void setUp() {
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("user1", "123");
        userList.addUser("user2", "456");
        userList.addUser("user3", "789");
        // TODO: find one of them
        User user = userList.findUserByUsername("user1");
        // TODO: assert that UserList found User
         String expected = "user1";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("user1", "123");
        userList.addUser("user2", "456");
        userList.addUser("user3", "789");
        // TODO: change password of one user
        boolean actual = userList.changePassword("user2", "456", "new456");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("user1", "123");
        userList.addUser("user2", "456");
        userList.addUser("user3", "789");
        // TODO: call login() with correct username and password
        User user;
        user = userList.login("user3", "789");
        // TODO: assert that User object is found
        String expected = "user3";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("user1", "123");
        userList.addUser("user2", "456");
        userList.addUser("user3", "789");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("user3", "123");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}