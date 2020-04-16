/*
Your client owns an import business and client needs to calculate the retail price of products each time client receives a shipment.
The number of items differ for each shipment.
You and your partner are commission to write a program to compute retail price of each item of a shipment.
And you are provided with the following formula:

         Retail Price = Wholesale Cost X 2.5

Unfortunately, your partner got sick in the middle of the project and it is up to you to complete it.
Please finish the project WITHOUT changing the existing code.
 */
import java.util.Scanner;

public class RetailPrice {

    public static void main(String args[]) {
        String cont = "";
        double cost, retail, rate;
        rate = 2.5;
        retail = 0;
        String input ;

        Scanner keybd = new Scanner(System.in);

        do {
            // Prompt user to enter cost and to enter -1 when user is done.
            System.out.print("Please enter Wholesale cost. Press -1 when you finish: ");
            cost = keybd.nextDouble();

            // check cost is a positive number. -1 is used since it is our key value to show the final result
            if(cost < -1){
                System.out.println("Cost can't be negative pls use proper number? ");
            }

            else if(cost != -1) {
                retail += cost * rate;

            }
            
            else if(cost == -1){
                cont = "n";
                System.out.println("\n**********************************");
                System.out.println("Retail Price is " + retail);
                System.out.println("**********************************");

            }

        } while(!cont.equals("n"));
    }
}
