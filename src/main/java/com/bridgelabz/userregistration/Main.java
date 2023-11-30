package com.bridgelabz.userregistration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserOperators userOperator = new UserOperators();

        System.out.println("Hi User, Please Register");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        if(userOperator.isValidFirstName(firstName)){
            User user = userOperator.registerUser(firstName);
            System.out.println("User Created");
        }
        else{
            System.out.println("Invalid Details");
        }
    }
}