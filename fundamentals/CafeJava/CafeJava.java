public class CafeJava {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffee = 1.2;
        double latte = 3.0;
        double cappuccino = 2.95;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // Cindhuri's order
        System.out.println("------------------------------");
        System.out.println(generalGreeting + customer1);
        if(isReadyOrder1){
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffee);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // Noah's order
        System.out.println("------------------------------");
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        // Sam's order
        System.out.println("------------------------------");
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (latte * 2));
        isReadyOrder2 = true;
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        } else {
            System.out.println(customer2 + pendingMessage);
        }


        System.out.println("------------------------------");
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (cappuccino - dripCoffee));

        }
    }

