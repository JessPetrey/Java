//  order class should have string name, double total,
// boolean ready, and arraylist of items class
import java.util.ArrayList;


public class Order {
    private String name;
    // private double total = 0;   do not include total as a member var
    private boolean ready = false;
    private ArrayList<Item> items;

    // constructor - no params
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    // overloaded constructor
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //  class methods
    public void addItem(Item item) { //takes an Item object as a param - item is just the name I chose
        items.add(item); // add the passed in object to this instances list of items
    }

    public String getStatusMessage() {
        if(this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for(Item oneItem : items){
            total += oneItem.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + this.name);
        for (Item oneItem : items) {
            System.out.println(oneItem.getName() + " - $:" + oneItem.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    
    public void setIsReady(boolean ready) { this.ready = ready; }

    public ArrayList<Item> getItems() { return items; }
    public void setItems(ArrayList<Item> items) { this.items = items; }

}