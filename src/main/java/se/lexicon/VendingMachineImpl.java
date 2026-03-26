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
        return null;
    }

    @Override
    public int returnChange() {
        return 0;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}