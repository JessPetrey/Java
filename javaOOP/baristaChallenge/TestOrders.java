import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        //menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.00;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 2.50;
        
        Item item3 = new Item();
        item3.name = "Drip coffee";
        item3.price = 1.50;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 2.95;

        //order vars
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.items.add(item3); // add menu item to items array
        order1.total += item3.price;// increment total 
        order1.ready = true; //update order status

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item1);// add menu item to items array
        order2.total += item1.price;// increment total 
        order2.ready = true; //update order status

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);// add menu item to items array
        order3.total += item4.price;// increment total 

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);// add menu item to items array
        order4.total += item2.price;// increment total 
        //add additional items and update 
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price;
        order4.total += item2.price;


        //test cases
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: $%.2f\n", order1.total);
        System.out.printf("Ready: %b\n", order1.ready);
        System.out.printf("\n");

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: $%.2f\n", order2.total);
        System.out.printf("Ready: %b\n", order2.ready);
        System.out.printf("\n");

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: $%.2f\n", order3.total);
        System.out.printf("Ready: %b\n", order3.ready);
        System.out.printf("\n");

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: $%.2f\n", order4.total);
        System.out.printf("Ready: %b\n", order4.ready);
        System.out.printf("\n");
    }
}
