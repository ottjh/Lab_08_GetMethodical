import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String socialSecurityNumber = "";
        String ucStudentID = "";
        String menuChoice = "";
        boolean done = false;

        System.out.println("Social Security Numbers consist of 3 digits, a dash, then 2 digits, a dash, and 4 digits.");
        socialSecurityNumber = SafeInput.getRegExString(in, "Please enter your Social Security Number: ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Social Security Number: " + socialSecurityNumber);

        System.out.println("Student id numbers are m followed by 5 digits.");
        ucStudentID = SafeInput.getRegExString(in, "Please enter your student id number", "^(M|m)\\d{5}$");
        System.out.println("Student ID: " + ucStudentID);

        do {
            menuChoice = SafeInput.getRegExString(in, "Do you wish to Open, View, Save, or Quit? [O,V,S,Q]: ", "^[OoSsVvQq]$");
            if (menuChoice.equalsIgnoreCase("O"))
            {
                System.out.println("You have chosen to Open.");
            }
            else if(menuChoice.equalsIgnoreCase("V"))
            {
                System.out.println("You have chosen to View.");
            }
            else if(menuChoice.equalsIgnoreCase("S"))
            {
                System.out.println("You have chosen to Save.");
            }
            else
            {
                System.out.println("You have chosen to Quit.");
                done = true;
            }
        } while (!done);

    }
}
