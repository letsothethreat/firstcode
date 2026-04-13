package com.mycompany.registrationloginsystem;

// Author: Your name
// Student Number: Your Stududent Number
// Simple program for registration and Login
import java.util.Scanner;

public class RegistrationLoginSystem {

    //class to handle user details and checks
    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in)) {
        Login userlogin = new Login();
        
        String firstName;
        String lastName;       
        String username;
        String password;
        String cellPhonenumber;
        
        //This is the user validation
            System.out.println("Please enter your first name:");
            firstName = input.nextLine();
            
            System.out.println("Please enter your last name");
            lastName = input.nextLine();
            
                    
        //This is the username validation
        do {
            System.out.println("Please enter the username:");
            username = input.nextLine();
                        
            if (!userlogin.checkUserName(username)) {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            }
                        
                        
        } while (!userlogin.checkUserName(username));
                    
        System.out.println("Username successfully captured");
                    
        //This is the password validation
        do {
            System.out.println("Enter your password");
            password = input.nextLine();
                        
            if (!userlogin.checkPasswordComplexity(password)) {
            System.out.println("Passowrd is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            }
                        
        } while (!userlogin.checkPasswordComplexixity(password));
                    
        System.out.println("Password successfully captured");
                    
        // This is the cell phone number validation
        do {
            System.out.println("Enter your cellphone number(should begin with +27...):");
            cellPhonenumber = input.nextLine();
                        
            if(!userlogin.checkCellPhoneNumber(cellPhonenumber)) {
            System.out.println("Invalid phone. Ensure it includes the international code and correct length");
                        }
        } while (!userlogin.checkCellPhoneNumber(cellPhonenumber));
                    
        System.out.println("Cellphone number successfully captured");
                    
        //This is the register user section
        String registrationMessage = userlogin.registerUser(firstName, lastName, username, password);
        System.out.println(registrationMessage);
                    
        //This is the login section
        System.out.println("\n=== LOGIN ===");
                    
        System.out.println("Enter username:");
        String loginUsername = input.nextLine();
                    
        System.out.println("Enter password:");
        String loginPassword = input.nextLine();
                    
        boolean loginResult = userlogin.loginUser(loginUsername, loginPassword);
                    
        //This is to display the user status
        System.out.println(userlogin.returnLoginStatus(loginResult));
        
        input.close();
        
    }
}
}    
    
