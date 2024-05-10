package UI;

import java.util.Scanner;

public class OnlineFoodOrderingApp {

    public static void main(String[] args) {
        System.out.println("------------- Welcome To Online Food Delivery App --------------\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Admin\n2. Customer\n3. Delivery Agent");
        System.out.println("Select Your Role: ");
        int userRole = scanner.nextInt();

        // Based on user role, display corresponding menu
        switch (userRole) {
            case 1:
                //displayAdminMenu();
                break;
            case 2:
                //displayCustomerMenu();
                break;
            case 3:
                //displayDeliveryAgentMenu();
                break;
            default:
                System.out.println("Invalid user role.");
        }

    }
}
