public class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery: " + getName() + " | Price: " + getPrice() + " | Quantity: " + getQuantity());
    }
}

/*@Chesintha ➜ /workspaces/Day-01/Q8 (main) $ javac Eight.java
@Chesintha ➜ /workspaces/Day-01/Q8 (main) $ java Eight

Products in the Store:
Fruit: Apple | Price: 1.2 | Quantity: 100
Vegetable: Carrot | Price: 0.5 | Quantity: 150
Grocery: Rice | Price: 2.5 | Quantity: 50

After editing Apple:

Products in the Store:
Fruit: Apple | Price: 1.5 | Quantity: 120
Vegetable: Carrot | Price: 0.5 | Quantity: 150
Grocery: Rice | Price: 2.5 | Quantity: 50

After deleting Carrot:

Products in the Store:
Fruit: Apple | Price: 1.5 | Quantity: 120
Grocery: Rice | Price: 2.5 | Quantity: 50 */