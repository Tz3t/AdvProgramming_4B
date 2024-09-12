import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<subscription> subscriptionList = new ArrayList<subscription>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the subscription tracker");

        while (choice != 4) {
            System.out.println("Please choose an option \n 1. Add a subscription \n 2. Remove a subscription \n 3. View all subscriptions \n 4. Exit");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice\n Please choose a number between 1 and 4");
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("Enter the name of the subscription");
                        String name = scanner.next( );
                        System.out.println("Enter the price of the subscription");
                        int price = scanner.nextInt();
                        System.out.println("Enter the number of months");
                        int months = scanner.nextInt();
                        subscription new_sub = new subscription(name, price, months);
                        subscriptionList.add(new_sub);
                        System.out.println(name + " subscription added successfully");
                        break;
                    case 2:
                        if (subscriptionList.size() == 0) {
                            System.out.println("There are no subscriptions to remove");
                        } else {
                            System.out.println("Enter the number of the subscription to remove it:");
                            for (int i = 0; i < subscriptionList.size(); i++) {
                                System.out.println((i+1) + ". Name: " + subscriptionList.get(i).getName() + ", Price: " + subscriptionList.get(i).getPrice() + ", Months: " + subscriptionList.get(i).getMonths() + ", Total Price: " + subscriptionList.get(i).getTotalPrice());
                            }
                            int remove_sub = scanner.nextInt();
                            if (remove_sub < 1 || remove_sub > subscriptionList.size()) {
                                System.out.println("Invalid choice\n Please choose a number between 1 and " + subscriptionList.size());
                            } else {
                                subscriptionList.remove(remove_sub - 1);
                                System.out.println("Subscription removed successfully");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Here is the number subscriptions:\n" + (subscriptionList.size()));
                        System.out.println("Here are the subscriptions:");
                        int total = 0;
                        for (subscription sub : subscriptionList) {
                            System.out.println("Name: " + sub.getName() + ", Price: " + sub.getPrice() + ", Months: " + sub.getMonths() + ", Total Price: " + sub.getTotalPrice());
                            total += sub.getTotalPrice();
                        }
                        System.out.println("Total: " + total);
                        break;
                    case 4:
                        System.out.println("Exiting the application. Goodbye!");
                        break;
                }
            }
        }
        scanner.close();}}