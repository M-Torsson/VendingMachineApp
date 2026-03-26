package se.lexicon;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    private IVendingMachine vendingMachine;
    private Scanner scanner;

    public ConsoleUI() {
        vendingMachine = new VendingMachineImpl();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Vending Machine Menu ---");
            System.out.println("1. View products");
            System.out.println("2. Insert coin");
            System.out.println("3. Purchase product");
            System.out.println("4. Show balance");
            System.out.println("5. Return change");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    insertCoin();
                    break;
                case 3:
                    purchaseProduct();
                    break;
                case 4:
                    System.out.println("Current balance: " + vendingMachine.getBalance());
                    break;
                case 5:
                    System.out.println("Returned change: " + vendingMachine.returnChange());
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void showProducts() {
        List<Product> products = vendingMachine.getProducts();

        for (Product product : products) {
            System.out.println(
                    product.getId() + " - " +
                            product.getName() + " - Price: " +
                            product.getPrice() + " - Quantity: " +
                            product.getQuantity() + " - " +
                            product.getDescription()
            );
        }
    }

    private void insertCoin() {
        System.out.print("Insert coin (1, 2, 5, 10, 20, 50): ");
        int coin = scanner.nextInt();
        vendingMachine.insertCoin(coin);
    }

    private void purchaseProduct() {
        System.out.print("Enter product id: ");
        int productId = scanner.nextInt();

        Product product = vendingMachine.purchaseProduct(productId);

        if (product != null) {
            System.out.println("You bought: " + product.getName());
        }
    }
}