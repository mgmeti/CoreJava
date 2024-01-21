package coreJavaDay1.CoreJavaDay1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.*;

class Product {
    String name;
    double price;
    int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Update product quantity
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
        System.out.println(name + " quantity updated to " + newQuantity);
    }

    // Convert product data to a string for saving to a file
    public String toFileString() {
        return name + "," + price + "," + quantity;
    }

    // Check if the product is low in stock
    public boolean isLowInStock(int threshold) {
        return quantity < threshold;
    }
}

public class InventoryManagementSystem {

    private static final String FILE_PATH = "D:\\java\\coreJava\\practiceExamples\\coreJavaDay1\\CoreJavaDay1\\inventory.txt";
    private static final int LOW_STOCK_THRESHOLD = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();
        // Load inventory from file
        loadInventoryFromFile(inventory);

        try {

            // Add products to inverntory
            // inventory.add(new Product("Laptop", 899.99, 10));
            // inventory.add(new Product("Smartphone", 499.99, 20));
            // inventory.add(new Product("Earbuds", 49.99, 50));

            // Display product details
            for (Product product : inventory) {
                product.displayProduct();
                System.out.println("----------------");
            }

            // Update product quantity
            System.out.print("Enter the new quantity for Laptop: ");
            int newQuantity = scanner.nextInt();
            inventory.get(0).updateQuantity(newQuantity);

            // add new product
            System.out.print("Enter the name of the new product: ");
            String newName = scanner.next();
            System.out.print("Enter the price of the new product: ");
            double newPrice = scanner.nextDouble();
            System.out.print("Enter the quantity of the new product: ");
            int newProductQuantity = scanner.nextInt();

            inventory.add(new Product(newName, newPrice, newProductQuantity));

            // Display the updated inventory
            System.out.println("Updated Inventory");
            for (Product product : inventory) {
                product.displayProduct();
                System.out.println("------------------");
            }

            // Remove a product
            System.out.print("Enter the name of the product to remove: ");
            String productToRemove = scanner.next();

            Iterator<Product> iterator = inventory.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.name.equals(productToRemove)) {
                    iterator.remove();
                    System.out.println(productToRemove + " removed from inventory");
                }
            }

            // Calulate total inventory value

            double totalValue = 0;
            for (Product product : inventory) {
                totalValue += product.price * product.quantity;
            }
            System.out.println("Total Inventory Value: $" + totalValue);

            // Check for low stock items an notify
            checkLowStockItems(inventory);

            // Save inventory to file
            saveInventoryTOFile(inventory);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            e.printStackTrace();
        } finally {

            // Close the scanner
            scanner.close();

        }
    }

    private static void checkLowStockItems(ArrayList<Product> inventory) {
        System.out.println("Low Stock Items: ");
        for (Product product : inventory) {
            if (product.isLowInStock(LOW_STOCK_THRESHOLD)) {
                System.out.println(product.name + " is low in stock. Quantity: " + product.quantity);
            }
        }
        System.out.println("End of Low Stock Items Notification");
    }

    private static void saveInventoryTOFile(ArrayList<Product> inventory) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Product product : inventory) {
                writer.write(product.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving inventory to file: " + e.getMessage());
        }
    }

    private static void loadInventoryFromFile(ArrayList<Product> inventory) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    int quantity = Integer.parseInt(parts[2]);
                    inventory.add(new Product(name, price, quantity));

                }
            }
        } catch (IOException e) {
            System.out.println("Error loading inventory from file: " + e.getMessage());
        }
    }

}
