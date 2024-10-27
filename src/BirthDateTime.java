import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "What year were you born [1950-2015]?", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "What month were you born [1-12]?", 1, 12);

        switch (birthMonth)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                birthDay = SafeInput.getRangedInt(in, "What day were you born [1-31]", 1, 31);
                break;
            case 4, 6, 9, 11:
                birthDay = SafeInput.getRangedInt(in, "What day were you born [1-30]?", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "What day were you born [1-29]?", 1, 29);
                break;
        }
        birthHour = SafeInput.getRangedInt(in, "What hour were you born [1-24]?", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "What minute were you born [1-60]?", 1, 60);

        //Now to output it

        System.out.println("You said you were born in the year: " + birthYear + ". In the month: " + birthMonth + ". In the day: " + birthDay + ". In the hour: " + birthHour + ". In the minute: " + birthMinute + ".");
    }
}
