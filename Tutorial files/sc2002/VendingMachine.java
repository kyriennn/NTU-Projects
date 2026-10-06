package sc2002;
import java.util.Scanner;

public class VendingMachine {
    public VendingMachine(){}
    
    public double selectDrink(){
        Scanner sc = new Scanner(System.in);
        double cost = 0.0;
        int choice;

        System.out.println("\n--- Available Drinks ---");
        System.out.println("1. Coke          $1.50");
        System.out.println("2. Green Tea     $1.20");
        System.out.println("3. Mineral Water $1.00");

        do{
            System.out.println("Select a drink: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: cost = 1.50;
                break;

                case 2: cost = 1.20;
                break;

                case 3: cost = 1.00;
                break;

                default: System.out.println("Invalid Choice. Please try again.");
            }
        }
         while(cost == 0.0);

         System.out.println("Drink cost: " + cost);
         return cost;
    }

    public double insertCoins(double drinkCost){
        Scanner sc = new Scanner(System.in);
        double amt = 0.0;
        System.out.println("Please insert coins: ");
        System.out.println("========== Coins Input ==========");
        System.out.println("|Enter 'Q' for ten cents input|");
        System.out.println("|Enter 'T' for twenty cents input|");                    
        System.out.println("|Enter 'F' for fifty cents input|");                 
        System.out.println("|Enter 'N' for a dollar input|");
        System.out.println("==================================");

        while(amt <= drinkCost){
            String input = sc.next().toUpperCase();
            char coin = input.charAt(0);
            double value = 0.0;

            switch(coin){
                case 'Q': value = 0.10;
                break;
                case 'T': value = 0.20;
                break;
                case 'F': value = 0.50;
                break;
                case 'N': value = 1.00;
                break;
                default: System.out.println("Invalid choice. Please try again");
                continue;
            }

            amt += value;
            System.out.println("Coins inserted: $" + amt);
        }

        return amt;
    }

    public void checkChange(double amount, double drinkCost){
        double change = 0.0;
        if(amount > drinkCost){
            change = amount - drinkCost;
            System.out.println("Change: $" + change);
        }
    }

    public void printReceipt(){
        System.out.println("Please collect your drink");
        System.out.println("Thank you!");
    }
}
