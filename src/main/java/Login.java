public class Login {
    
    String storedUsername ;
    String storedPassword ;
    
    //this is my check username method
    public boolean checkUserName(String Username) {
        if (Username.length()<=5 && Username.contains("_")) { 
    //This method is used to check if the username follows the correct format
        System.out.println(Username);
        return true;
        }  
        else {
            return false;
        }    
    }
        //This is my check password complexity method
    public boolean checkPasswordComplexity(String password) { 
    //This method is used to check if the passowrds meets all the requirements
        if (password.length() <8)
            return false;
     
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasCapital = true;
            else if (Character.isDigit(ch)) hasNumber = true;
            else if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
            
            //Stop early if all the conditions are met
            if (hasCapital && hasNumber && hasSpecial) return true;
            
        }
        
        return false;
    
    }
    //This is my check cellphone number method
    public boolean checkCellPhoneNumber(String phoneNumber){
            if(!phoneNumber.startsWith("+")){
                return false;
        }
        String digitsOnly = phoneNumber.substring(1);
        if (!digitsOnly.matches("\\d+")){
            return false;
                    
        }
        
        if (digitsOnly.length() <10  && digitsOnly.length() >15) ;
            return false ;
        }     
    
    //This is my register user method
public String registerUser(String username, String password) {
    
    if (!checkUserName(username)) {
        return"Username is not correctly formatted.";
    }
     
    if (!checkPasswordComplexity(password)) {
        return "Password does not meet complexity requirements.";
        
    } 
    
    //storing valid details
    storedUsername = username;
    storedPassword = password;
    
        return "User has been registered susccesfully.";
    }
    //This is my login user method
    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
        
    }
    
    //This is my return login status method
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess);
            return "Login successful."; 
    }

    boolean checkUsername(String kokeletso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}     