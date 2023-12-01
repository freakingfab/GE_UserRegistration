package com.bridgelabz.userregistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
    @desc: class for all the operations and functions for registration of the User
 */
public class UserOperators {
    /*
        @desc: creates a user with given properties
        @params: properties of User classs
        @return: User object
     */
    public User registerUser(String firstName, String lastName, String email, String mobileNumber, String password){
        return new User(firstName, lastName, email, mobileNumber, password);
    }

    /*
        @desc: checks for valid first Name
        @params: firstName(String)
        @return: boolean
     */
    public boolean isValidFirstName(String firstName){
        if (firstName == null) {
            throw new IllegalArgumentException("First Name cannot be null");
        }

        String firstNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        if(firstName.matches(firstNameRegex)){
            return true;
        }
        else{
            throw new IllegalArgumentException("Invalid first name format");
        }
    }

    /*
        @desc: checks for valid last Name
        @params: LastName(String)
        @return: boolean
     */
    public boolean isValidLastName(String lastName){
        if (lastName == null) {
            throw new IllegalArgumentException("Last Name cannot be null");
        }

        String lastNameRegex = "^[A-Z][a-zA-Z]{2,}$";
        if(lastName.matches(lastNameRegex)){
            return true;
        }
        else{
            throw new IllegalArgumentException("Invalid last name format");
        }
    }

    /*
        @desc: checks for valid email
        @params: Email(String)
        @return: boolean
     */
    public boolean isValidEmail(String email){
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        if(email.matches(emailRegex)){
            return true;
        }
        else{
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    /*
        @desc: checks for valid mobile no.
        @params: MobileNumber(String)
        @return: boolean
     */
    public boolean isValidMobileNo(String mobileNumber){
        if (mobileNumber == null) {
            throw new IllegalArgumentException("Mobile number cannot be null");
        }

        String mobileNumberRegex = "^\\d{2} \\d{10}$";
        if(mobileNumber.matches(mobileNumberRegex)){
            return true;
        }
        else{
            throw new IllegalArgumentException("Invalid mobile number format");
        }
    }

    /*
        @desc: checks for valid password
        @params: Password(String)
        @return: boolean
     */
    public boolean isValidPassword(String password){
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }

        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{8,}$";
        if(password.matches(passwordRegex)){
            return true;
        }
        else{
            throw new IllegalArgumentException("Invalid email format");
        }
    }
}
