package se.lexicon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineImplTest {

    @Test
    void testInsertCoin() {
        VendingMachineImpl vm = new VendingMachineImpl();
        vm.insertCoin(10);
        assertEquals(10, vm.getBalance());
    }

    @Test
    void testPurchaseProduct() {
        VendingMachineImpl vm = new VendingMachineImpl();

        vm.insertCoin(20);

        Product product = vm.purchaseProduct(1);

        assertNotNull(product);
        assertEquals("Chips", product.getName());
        assertEquals(0, vm.getBalance());
    }

    @Test
    void testReturnChange() {
        VendingMachineImpl vm = new VendingMachineImpl();

        vm.insertCoin(20);

        int change = vm.returnChange();

        assertEquals(20, change);
        assertEquals(0, vm.getBalance());
    }
}