package com.bridgelabz.userregistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    @desc: class for testing user registration
 */
public class UserTest {

    /*
        @desc: happy test for user registration
        @params: none
        @return: void
     */
    @Test
    public void happyUserRegistrationTest(){
        UserOperators userOperator = new UserOperators();
        User user = null;
        try {
            if (userOperator.isValidFirstName("Daksh") &&
                    userOperator.isValidLastName("Nahar") &&
                    userOperator.isValidEmail("dak@gm.com") &&
                    userOperator.isValidMobileNo("91 6377271771") &&
                    userOperator.isValidPassword("Daksh@123")) {

                user = userOperator.registerUser("Daksh", "Nahar", "dak@gm.com", "91 6377271771", "Daksh@123");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid Argument: " + e.getMessage());
        }
        assertNotNull(user);
    }

    /*
    @desc: sad test for user registration
    @params: none
    @return: void
 */
    @Test
    public void sadUserRegistrationTest(){
        UserOperators userOperator = new UserOperators();
        User user = null;
        try {
            if (userOperator.isValidFirstName("Daksh") &&
                    userOperator.isValidLastName("Nahar") &&
                    userOperator.isValidEmail("dak@gm.com") &&
                    userOperator.isValidMobileNo("916377271771") &&
                    userOperator.isValidPassword("daksh@123")) {

                user = userOperator.registerUser("Daksh", "Nahar", "dak@gm.com", "916377271771", "daksh@123");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid Argument: " + e.getMessage());
        }
        assertNull(user);
    }
}

