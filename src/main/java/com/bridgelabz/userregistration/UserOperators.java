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
    public User registerUser(String firstName){
        return new User(firstName);
    }

    /*
        @desc: checks for valid first Name
        @params: firstName(String)
        @return: boolean
     */
    public boolean isValidFirstName(String firstName){
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    /*
        @desc: checks for valid last Name
        @params: LastName(String)
        @return: boolean
     */
    public boolean isValidLastName(String lastName){
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    /*
        @desc: checks for valid email
        @params: Email(String)
        @return: boolean
     */
    public boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
