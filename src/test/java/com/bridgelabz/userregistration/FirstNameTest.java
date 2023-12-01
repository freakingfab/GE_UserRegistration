package com.bridgelabz.userregistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    @desc: class for testing isValidFirstName
 */
public class FirstNameTest {

    @Test
    public void testIsValidFirstName() {
        UserOperators userOperator = new UserOperators();
        assertNotNull(userOperator);

        try {
            assertTrue(userOperator.isValidFirstName("daksh"));
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid Argument: " + e.getMessage());
        }
    }
}
