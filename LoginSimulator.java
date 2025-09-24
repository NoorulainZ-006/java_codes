//Login Simulator

import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials. Please try again.");
        }
    }
}
