package com.bridgelabz.userregistration;

/*
    @desc: class with user properties
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;

    /*
        @desc: constructor for the class
        @params: properties
        @return: none
     */
    public User(String firstName, String lastName, String email, String mobileNumber, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

