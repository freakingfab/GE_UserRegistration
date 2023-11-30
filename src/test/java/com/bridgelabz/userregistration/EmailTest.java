package com.bridgelabz.userregistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

/*
    @desc: class for testing email validation function
 */
public class EmailTest {

    /*
        @desc: test for list of emails
        @params: none
        @return: Void
     */
    @Test
    public void testListOfEmails() {
        UserOperators userOperator = new UserOperators();
        List<String> emails = Arrays.asList("abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc123@.com", "abc()*@gmail.com");
        List<Boolean> expectedAnswers = Arrays.asList(true, true, true, true, false, false);
        for (int i = 0; i < emails.size(); i++) {
            boolean actualAnswer = userOperator.isValidEmail(emails.get(i));
            boolean expectedAnswer = expectedAnswers.get(i);

            Assertions.assertEquals(expectedAnswer, actualAnswer,
                    "Email validation failed for: " + emails.get(i));
        }
    }
}
