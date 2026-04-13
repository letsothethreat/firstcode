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
    
  //
    public Login(String firstName, String lastName, String username, String password, String cellPhoneNumber)  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.cellPhoneNumber = cellPhoneNumber;
  }
    
  //this is my check username method
    public boolean checkUserName() {
    return username.contains("_") & username.length() <=5;
    
  }
    
  //Password must be at least 8 charactersc, contains uppercase, digits and special character
    public boolean checkPasswordComplexity() {
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
            
        
  } 
      return hasUpper && hasDigit && hasSpecial;
      
     
   }
    
  //This is my check cellphone number method
    public boolean checkCellPhoneNumber() {
        if(!cellPhoneNumber.startsWith("+27")) && phoneNumber.length() >=12;
      

    }
    
  //This is my register user method
    public String registerUser() {
        if(checkUserName() && checkPasswordComplexity() && checkCellPhoneNumber()) {
      return "Registration successful for user: " + username;
      
      } else {
      return "Registration failed.Please try again" ;
      
    }
    }
    
  //This is my return login status method
    public String returnLoginStatus(String enterUsername, String enteredPassword) {
}
