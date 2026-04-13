package com.mycompany.registrationloginsystem;

/**
 *
 * @author Student
 */
public class Login {
    String firstName;
    String lastName;
    String username;
    String password;
    String cellPhoneNumber;
    
  //Constructor
    public Login(String firstName, String lastName, String username, String password, String cellPhoneNumber, String string5)  {
      this.firstName = firstName;
      this.lastName = lastName;
      this.username = username;
      this.password = password;
      this.cellPhoneNumber = cellPhoneNumber;
  }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
  //this is my check username method
    public boolean checkUserName(String username1) {
    return username.contains("_") & username.length() <=5;
    
  }
    
  //Password must be at least 8 charactersc, contains uppercase, digits and special character
    public boolean checkPasswordComplexity(String hasDigit) {
  //This method is used to check if the passowrds meets all the requirements    
    if (password.length() <8) {
        return false;
    }
    
    boolean hasCapital = false;
    boolean hasNumber = false;
    boolean hasSpecial = false;
    
    for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasCapital = true;
            else if (Character.isDigit(ch)) hasNumber = true;
            else if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
            
        }
    
       
      return hasCapital && hasNumber && hasSpecial;
      
}    

    
  //This is my check cellphone number method
    public boolean checkCellPhoneNumber(String cellPhoneNumber1) {
        return cellPhoneNumber1.startsWith("+27") && cellPhoneNumber1.length() >=12;
      

    }
    
  //This is my register user method
    public String registerUser(String firstName1, String lastName1, String username1, String password1, String cellPhoneNumber1) {
        if (checkPasswordComplexity(password1) && checkCellPhoneNumber(cellPhoneNumber1)) {
            
            this.firstName = firstName1;
            this.lastName = lastName1;
            this.username = username1;
            this.password = password1;
            this.cellPhoneNumber = cellPhoneNumber1;
            
        return "Registration successful for user: " + username1;
        
      } else {
        return "Registration failed.Please try again" ;
      
    }
    }
    
  //This is my return login status method
    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        
        if(this.username.equals(enteredUsername) && this.password.equals(enteredPassword)) {
       return "Login successful. Welcome" + firstName + "" + lastName + "!";
       
       
        } else {
        return "Login unsuccessful. Incorrect username or password.";
        }
    }
}

   
