import java.util.Date;

public class AlfredQuotes {
    // returns a generic greeting
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    // returns a personalized greeting
    public String guestGreeting(String name) {
        String greetGuest = String.format("Hello %s. Lovely to see you.", name);
        return greetGuest;
    }
    // returns the current date and time
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate;
    }
    // returns a response based on whether a keyword is present in the provided string
    public String respondBeforeAlexis(String conversation) {
        
        if(conversation.indexOf("Alexis") > -1){
            return "Right away sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally.";
        } 
        else {
            return "Right. And with that, I shall retire.";
        }
    }
}