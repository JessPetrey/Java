import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        //menu items
        Item item1 = new Item("Mocha", 3.00);

        Item item2 = new Item("Latte", 2.50);
        
        Item item3 = new Item("Drip coffee", 1.50);

        Item item4 = new Item("Cappuccino", 2.95);

        //order vars
        Order order1 = new Order();
        order1.addItem(item3); // add menu item to items array


        Order order2 = new Order();
        order2.addItem(item1);// add menu item to items array



        //create 2 orders without specifying name
        System.out.printf("Name: %s \n%s \n", order1.getName(), order1.getStatusMessage());
        System.out.printf("Total: $%.2f\n", order1.getOrderTotal());
        System.out.printf("-----------------\n");

        System.out.printf("Name: %s \n%s \n ", order2.getName(), order2.getStatusMessage());
        // System.out.printf("Total: $%.2f\n", order2.total);
        System.out.printf("-----------------\n");

        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: $%.2f\n", order3.total);
        // System.out.printf("Ready: %b\n", order3.ready);
        // System.out.printf("\n");

        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: $%.2f\n", order4.total);
        // System.out.printf("Ready: %b\n", order4.ready);
        // System.out.printf("\n");
    }
}
