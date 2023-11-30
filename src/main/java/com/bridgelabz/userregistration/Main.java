package com.bridgelabz.userregistration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserOperators userOperator = new UserOperators();

        System.out.println("Hi User, Please Register");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        System.out.print("Enter your Last name: ");
        String lastName = scanner.next();

        System.out.print("Enter your Email: ");
        String email = scanner.next();

        if(userOperator.isValidFirstName(firstName) && userOperator.isValidLastName(lastName) && userOperator.isValidEmail(email)){
            User user = userOperator.registerUser(firstName);
            System.out.println("User Created");
        }
        else{
            System.out.println("Invalid Details");
        }
    }
}