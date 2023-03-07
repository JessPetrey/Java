import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        //menu items
        Item item1 = new Item("Mocha", 3.00);
        Item item2 = new Item("Latte", 2.50);
        Item item3 = new Item("Drip coffee", 1.50);
        Item item4 = new Item("Cappuccino", 2.95);


        //create 2 orders without specifying name
        System.out.println("-----------------\n");
        Order order1 = new Order();
        order1.addItem(item3); // add menu item to items array
        order1.addItem(item4);
        System.out.println("Your total is " + order1.getOrderTotal());
        order1.display();
        System.out.println("-----------------\n");

        Order order2 = new Order();
        order2.addItem(item1);// add menu item to items array
        order2.addItem(item2);
        order2.setIsReady(true);
        System.out.println(order2.getName() + ", " + order2.getStatusMessage());
        order2.display();
        System.out.println("-----------------\n");


        // create 3 named orders
        Order order3 = new Order("Jessica");
        order3.addItem(item2);
        order3.addItem(item4);
        order3.display();
        System.out.println("-----------------\n");

        Order order4 = new Order("Renan");
        order4.addItem(item1);
        order4.addItem(item3);
        order4.display();
        System.out.println("-----------------\n");

        Order order5 = new Order("Beau");
        order5.addItem(item1);
        order5.addItem(item4);
        order5.display();
        System.out.println("-----------------\n");
    }
}
