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
    }

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String isReady() { return ready; }
    public void setIsReady(boolean ready) { this.ready = ready; }

    public String getItems() { return items; }
    public void setItems(ArrayList<Item> items) { this.items = items; }


}