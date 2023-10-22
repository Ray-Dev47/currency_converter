import java.util.Scanner;

/**
 * currencyConverter
 * 
First we are going to take the user currency input in which currency he wants to enter the amount
Then will take the amount of input from the user
Then using the switch case and function calculate the amount in the destinated currency
 */
public class currencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Please select select currencr below");
        System.out.println("1. Dollar");
        System.out.println("2. Naira");
        System.out.println("3. Pounds");
        System.out.println("4. Euro");
        System.out.println("-----------------");
        int num = sc.nextInt();

        // int amount;
          System.out.println("Enter the amount");
         int amount = sc.nextInt();
        

        switch (num) {
            case 1:
               double convertedNaira = amount * 1100;
               double convertedPounds = amount *  0.822978;
               double convertedEuro = amount *  0.94355;
               System.out.println(amount + " Dollars is equal to " + convertedNaira + " Naira" );
               System.out.println(amount + " Dollars is equal to " + convertedPounds + " Pounds" );
               System.out.println(amount + " Dollars is equal to " + convertedEuro + " Euro" );
               break;
            
            case 2:
              double convertedDollar = amount * 1100;
               double convertedPounds1 = amount *  0.822978;
               double convertedEuro1 = amount *  0.94355;
               System.out.println(amount + " Naira is equal to " + convertedDollar + " Dollars" );
               System.out.println(amount + " Naira is equal to " + convertedPounds1 + " Pounds" );
               System.out.println(amount + " Naira is equal to " + convertedEuro1 + " Euro" );
               break;

            case 3:
              double convertedDollar2 = amount * 1.2151;
               double convertedNaira2 = amount *  1500;
               double convertedEuro2 = amount * 1.146508;
               System.out.println(amount + " Pounds is equal to " + convertedDollar2 + " Dollars" );
               System.out.println(amount + " Pounds is equal to " + convertedNaira2 + " Naira" );
               System.out.println(amount + " Pounds is equal to " + convertedEuro2 + " Euro" );
               break;

            case 4:
              double convertedDollar3 = amount * 1.060354;
               double convertedNaira3 = amount *  810.325377;
               double convertedPounds3 = amount *  0.872214;
               System.out.println(amount + " Euro is equal to " + convertedDollar3 + " Dollars" );
               System.out.println(amount + " Euro is equal to " + convertedNaira3 + " Naira" );
               System.out.println(amount + " Euro is equal to " + convertedPounds3 + " Euro" );
               break;

        
            default:
                break;
        }
        sc.close();
    }
}