package com.bridgelabz.userregistration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserOperators userOperator = new UserOperators();

//        System.out.println("Hi User, Please Register");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your first name: ");
//        String firstName = scanner.nextLine();
//
//        System.out.print("Enter your Last name: ");
//        String lastName = scanner.nextLine();
//
//        System.out.print("Enter your Email: ");
//        String email = scanner.nextLine();
//
//        System.out.print("Enter your Mobile Number: ");
//        String mobileNumber = scanner.nextLine();
//
//        System.out.print("Enter your Password: ");
//        String password = scanner.nextLine();
//
//        if(userOperator.isValidFirstName(firstName) && userOperator.isValidLastName(lastName) && userOperator.isValidEmail(email) && userOperator.isValidMobileNo(mobileNumber) && userOperator.isValidPassword(password)){
//            User user = userOperator.registerUser(firstName);
//            System.out.println("User Created");
//        }
//        else{
//            System.out.println("Invalid Details");
//        }

        

        // Seperate Email testing
        System.out.println("Email1: abc@yahoo.com -> " + userOperator.isValidEmail("abc@yahoo.com"));
        System.out.println("Email2: abc-100@yahoo.com, -> " + userOperator.isValidEmail("abc-100@yahoo.com"));
        System.out.println("Email3: abc.100@yahoo.com,-> " + userOperator.isValidEmail("abc.100@yahoo.com"));
        System.out.println("Email4: abc111@abc.com -> " + userOperator.isValidEmail("abc111@abc.com"));
        System.out.println("Email5: abc-100@abc.net -> " + userOperator.isValidEmail("abc-100@abc.net"));
        System.out.println("Email6: abc.100@abc.com.au -> " + userOperator.isValidEmail("abc.100@abc.com.au"));
        System.out.println("Email7: abc@1.com -> " + userOperator.isValidEmail("abc@1.com"));
        System.out.println("Email8: abc@gmail.com.com -> " + userOperator.isValidEmail("abc@gmail.com.com"));
        System.out.println("Email9: abc+100@gmail.com -> " + userOperator.isValidEmail("abc+100@gmail.com"));
        System.out.println("Email10: abc -> " + userOperator.isValidEmail("abc"));
        System.out.println("Email11: abc@.com.my -> " + userOperator.isValidEmail("abc@.com.my"));
        System.out.println("Email12: abc123@gmail.a -> " + userOperator.isValidEmail("abc123@gmail.a"));
        System.out.println("Email13: abc123@.com -> " + userOperator.isValidEmail("abc123@.com"));
        System.out.println("Email14: abc123@.com.com -> " + userOperator.isValidEmail("abc123@.com.com"));
        System.out.println("Email15: .abc@abc.com-> " + userOperator.isValidEmail(".abc@abc.com"));
        System.out.println("Email16: abc()*@gmail.com -> " + userOperator.isValidEmail("abc()*@gmail.com"));
        System.out.println("Email17: abc@%*.com -> " + userOperator.isValidEmail("abc@%*.com"));
        System.out.println("Email18: abc..2002@gmail.com -> " + userOperator.isValidEmail("abc..2002@gmail.com"));
        System.out.println("Email19: abc.@gmail.com -> " + userOperator.isValidEmail("abc.@gmail.com"));
        System.out.println("Email20: abc@abc@gmail.com -> " + userOperator.isValidEmail("abc@abc@gmail.com"));
        System.out.println("Email19: abc@gmail.com.1a -> " + userOperator.isValidEmail("abc@gmail.com.1a"));
        System.out.println("Email20: abc@gmail.com.aa.au -> " + userOperator.isValidEmail("abc@gmail.com.aa.au"));
    }
}