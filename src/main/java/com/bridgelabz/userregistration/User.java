package com.bridgelabz.userregistration;

/*
    @desc: class with user properties
 */
public class User {
    private String firstName;

    /*
        @desc: constructor for the class
        @params: firstName(String)
        @return: none
     */
    public User(String firstName){
        this.firstName = firstName;
    }

    /*
        @desc: getters and setter for properties of User
        @params: getters->none, setters-> String
        @return: getters->String, setters->void
     */
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

}
