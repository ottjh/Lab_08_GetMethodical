import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favInt = 0;
        double favDouble = 0.0;

        favInt = SafeInput.getInt(in, "What is your favorite integer?");
        favDouble = SafeInput.getDouble(in, "What is your favorite double?");
        System.out.println("You said your favorite integer was: " + favInt +"\nYou said your favorite double was: " + favDouble);
    }
}
