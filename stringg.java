package stringg;
import java.util.Scanner;  // Import the Scanner class
public class stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How are you?");

	    String a = myObj.nextLine();  // Read user input
	    //System.out.println("Username is: " + userName);  // Output user input
	    
	    String b = "fine";
	    if(a.equals(b)){
            System.out.println("bot:Iam also fine.");
        } else {
            System.out.println("Bot:Take care of yourself.");
        }
	}

}
