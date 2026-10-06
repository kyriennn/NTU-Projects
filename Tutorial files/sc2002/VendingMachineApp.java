package sc2002;
import java.util.Scanner;

public class VendingMachineApp {
    public static void main(String[] args){
        VendingMachine vm = new VendingMachine();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running){
            double drinkCost = vm.selectDrink();
            double amount = vm.insertCoins(drinkCost);

            vm.checkChange(amount, drinkCost);
            vm.printReceipt();

            System.out.println("Buy another drink?");
            running = sc.next().equalsIgnoreCase("y");
        }
    }
}
