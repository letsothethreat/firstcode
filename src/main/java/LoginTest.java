
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;


/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    /**
     * 
     *Test of checkUsername method, of class Login.
     */
    
    Login login = new Login();//Creating object of Login class
    //The username is correctly formatted
@Test
    public void testCheckUsernameCorrectFormat() {
        assertTrue(login.checkUsername("kokeletso_18"));
       
    }
    //The username is incorrectly formatted
    @Test
    public void testCheckUsernameIncorrectFormat() {
        assertFalse(login.checkUsername("kokeletso!!!!!!!!"));
        
    }
    //The username is missing an underscore
    @Test
    public void testCheckUsernameNoUnderscore() {
        assertFalse(login.checkUserName("kokeletso7"));
    
    }    
    
    //The password meets complexity
    @Test
    public void testCheckPasswordComplexity_Valid() {
        assertTrue(login.checkPasswordComplexity("Ch&&se"));
    
    }
    
    //The password does not meet complexity
    @Test
    public void testCheckPasswordComplexity_Invalid() {
        assertFalse(login.checkPasswordComplexity("password"));
        
    }
        
    //The cellphone number is correctly formatted (Matches your boolean logic)
    @Test 
    public void testCheckCellPhoneNumberCorrectFormat() {
        //Matches: Starts with +, digits only, length between 10-15 (excluding +)
        assertTrue(login.checkCellPhoneNumber("+27815798097"));
        
    }
    
    //The cellphone number is incorrectly formatted
    @Test
    public void testCheckCellPhoneNumberIncorrectFormat() {
        assertFalse(login.checkCellPhoneNumber("0815798097"));
        
    }
    
        //The login is successful
    @Test
    public void testLoginSuccessful() {
        login.registerUser("kokeletso_18", "Koke@18");
        assertTrue(login.loginUser("kokeletso_18", "Koke@18"));
        
    }
    
    //The login failed
    @Test
    public void testLoginFailed() {
        login.registerUser("kokeletso_18", "Koke@18");
        assertFalse(login.loginUser("Kokeletso_18", "incorrectpassword"));
    }
   
}

