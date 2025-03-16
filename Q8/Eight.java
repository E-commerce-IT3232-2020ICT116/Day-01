public class Eight {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        store.addProduct(new Fruit("Apple", 1.2, 100));
        store.addProduct(new Vegetable("Carrot", 0.5, 150));
        store.addProduct(new Grocery("Rice", 2.5, 50));

        store.displayProducts();

        store.editProduct(0, "Apple", 1.5, 120);

        System.out.println("\nAfter editing Apple:");
        store.displayProducts();

        store.deleteProduct(1);

        System.out.println("\nAfter deleting Carrot:");
        store.displayProducts();
    }
}
