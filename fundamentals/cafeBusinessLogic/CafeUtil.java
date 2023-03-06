import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        //  get the sum of ints 1-10 : should result in 55
        int sum = 0;
        int count = 1;
        // while loop adds the ints together, using vars above
        while(count <= 10){
            // System.out.println("count :"+count);
            sum += count;
            // System.out.println("Sum : "+sum);
            count++;
        }
        return sum;
    }

    // get sum of all prices in a giiven array
    public double getOrderTotal(double[] prices){
        double total = 0;
        for(double price : prices){
            total += price;
        }
        return total;
    }

    // print each index and menu item
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i < menuItems.size(); i++){
            String oneItem = menuItems.get(i);
            System.out.println(i + " " + oneItem);
        }
    }
    
    // add customer method
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        // get user input from terminal and store in 'userName'
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.println("There are " + customers.size() +" people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}