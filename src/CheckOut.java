import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0;
        double itemCost = 0.1;
        boolean done = false;

        System.out.println("You are at a store that sells things that cost $10.00 at most.");

        do {
            itemCost = SafeInput.getRangedDouble(in, "What is the price of your next item? [$0.50-$10.00]: ", 0.50, 10.00 );
            totalCost += itemCost;
            done = SafeInput.getYNConfirm(in, "Do you want to quit? [Y/N]: ");
        } while (!done);
        System.out.printf("Your total cost is :%.2f%n",totalCost);

    }
}
