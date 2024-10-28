import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //String userName = "";
        //userName = getNonZeroLenString(in, "What is your username?");
        //System.out.println("Your username is: " + userName);
        //int age = 0;
        //age = getInt(in, "What is your age?");
        //System.out.println("Your age is: " + age);
        //double burgerPrice = 0.0;
        //burgerPrice = getDouble(in, "What is the price of a burger in your area?");
        //System.out.println("You said the price of a burger in your area was: " + burgerPrice);
        //int favNum = 0;
        //favNum = getRangedInt(in,"What is your favorite single digit number?", 0, 9);
        //System.out.println("Your favorite single digit number is " + favNum);
        //double contestScore = 0;
        //contestScore = getRangedDouble(in, "You are a judge for a talent show, what score do you give the singing performer? [0.0-10.0]", 0, 10);
        //System.out.println("You ruled that they got a: " + contestScore);
        //boolean likePuppies = getYNConfirm(in, "Do you like puppies?");
       // if (likePuppies)
           // System.out.println("That's great, I do too!");
        //else
          //  System.out.println("That's a shame.");
        //String likesPupies = getRegExString(in, "Do you like puppies? [Y/N]", "[YyNn]");
        //System.out.println("You said: " + likesPupies);
        //prettyHeader(" Message Centered Here");
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    */
    //Had to refer to class lectures a few times, so its less than original. But I am trying to get a sense for methods.
    /**
    public static int getInt(Scanner pipe, String prompt)
    {
        //declaring and initializing
        int intRetValue = 0;
        String trash = "";
        boolean done = false;

        //Loop test for valid integer
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                intRetValue = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid whole number not: " + trash);
            }
        }while (!done);

        //send back value
        return intRetValue;
    }

    public static double getDouble(Scanner pipe, String prompt) //here I just need to use the int one and conver it to double
    {
        //declaring and initializing
        double doubleRetValue = 0;
        String trash = "";
        boolean done = false;

        //Loop test for valid double
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                doubleRetValue = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!done);

        //send back value
        return doubleRetValue;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) //I can just use the int one here and nest an additional requirement inside
    {
        //declaring and initializing
        int intRangedRetValue = 0;
        String trash = "";
        boolean done = false;

        //Loop test for valid integer
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                intRangedRetValue = pipe.nextInt();
                pipe.nextLine();
                if (intRangedRetValue > low && intRangedRetValue < high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nThe number you listed is not in the available range.");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a valid whole number between " + low + " and " + high + " not: " + trash);
            }
        }while (!done);

        //send back value
        return intRangedRetValue;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        //declaring and initializing
        double doubRangedRetValue = 0;
        String trash = "";
        boolean done = false;

        //Loop test for valid integer
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                doubRangedRetValue = pipe.nextDouble();
                pipe.nextLine();
                if (doubRangedRetValue > low && doubRangedRetValue < high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nThe number you listed is not in the available range.");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a valid number between " + low + " and " + high + " not: " + trash);
            }
        }while (!done);

        //send back value
        return doubRangedRetValue;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        //declaring and initializing
        boolean yNRetValue = false;
        String yesNo = "";
        String trash = "";
        boolean done = false;

        //Loop test for valid integer
        do {
            System.out.print("\n" + prompt + ": ");
            yesNo = pipe.nextLine();
            if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("n"))
            {
                if (yesNo.equalsIgnoreCase("y"))
                    yNRetValue = true;
                else
                    yNRetValue = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Yes or No [Y/N] not: " + yesNo);
            }
        }while (!done);
        //send back value
        return yNRetValue;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String regString = "";

        do
        {
            System.out.print(prompt + ": ");
            regString = pipe.nextLine();
            if(regString.matches(regEx))
                done= true;
            else
            {
                System.out.println("Please enter a valid input, not: " + regString);
            }
        } while (!done);
        return regString;
    }

    public static void prettyHeader(String msg)
    {
        for(int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");
        for(int i = 0; i < (54/2 - msg.length()/2); i++)
            System.out.print(" ");
        System.out.print(msg);
        for(int i = 0; i < (54/2 - msg.length()/2); i++)
            System.out.print(" ");
        System.out.print("***\n");
        for(int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
    }
    */
}
