import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Fahrenheit = 0;
        //Fahrenheit = CtoF(27) //Testing
        //System.out.println("Fahrenheit: " + Fahrenheit);

        System.out.println("Centigrade      Fahrenheit");
        System.out.println("==========================");
        for(int i = -100; i <= 100; i++)
        {
            Fahrenheit = CtoF(i);
            System.out.printf(i + "%18.2f\n", Fahrenheit);
        }
    }

    public static double CtoF(double Celsius)
    {
        double Fahrenheit;
        Fahrenheit = (Celsius * 9/5 + 32);
        return Fahrenheit;
    }
}
