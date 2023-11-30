package com.bridgelabz.userregistration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserOperators userOperator = new UserOperators();

        System.out.println("Hi User, Please Register");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your Mobile Number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();

        if(userOperator.isValidFirstName(firstName) && userOperator.isValidLastName(lastName) && userOperator.isValidEmail(email) && userOperator.isValidMobileNo(mobileNumber) && userOperator.isValidPassword(password)){
            User user = userOperator.registerUser(firstName);
            System.out.println("User Created");
        }
        else{
            System.out.println("Invalid Details");
        }
    }
}