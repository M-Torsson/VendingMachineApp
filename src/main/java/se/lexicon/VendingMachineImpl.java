package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements IVendingMachine {

    private int balance;
    private List<Product> products;

    public VendingMachineImpl() {
        products = new ArrayList<>();

        products.add(new Snack(1, "Chips", 20, 5));
        products.add(new Beverage(2, "Cola", 15, 5));
        products.add(new Fruit(3, "Apple", 10, 5));
    }

    @Override
    public void insertCoin(int coin) {
        if (coin == 1 || coin == 2 || coin == 5 || coin == 10 || coin == 20 || coin == 50) {
            balance += coin;
        } else {
            System.out.println("Invalid coin.");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public Product purchaseProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                if (product.getQuantity() <= 0) {
                    System.out.println("Product is out of stock.");
                    return null;
                }

                if (balance < product.getPrice()) {
                    System.out.println("Not enough balance.");
                    return null;
                }

                balance -= product.getPrice();
                product.setQuantity(product.getQuantity() - 1);

                return product;
            }
        }

        System.out.println("Product not found.");
        return null;
    }

    @Override
    public int returnChange() {
        int change = balance;
        balance = 0;
        return change;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}