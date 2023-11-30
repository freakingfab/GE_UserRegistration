package com.bridgelabz.userregistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
    @desc: class for testing isValidFirstName
 */
public class firstNameTest {

    @Test
    public void testIsValidFirstName() {
        UserOperators userOperator = new UserOperators();
        assertNotNull(userOperator);
        assertEquals(true, userOperator.isValidFirstName("Daksh"));
    }
}
