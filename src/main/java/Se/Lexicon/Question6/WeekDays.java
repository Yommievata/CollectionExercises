package Se.Lexicon.Question6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WeekDays {
    public static void main(String[] args) {
        Set<String> weekDays = new HashSet<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");


        String[] array = weekDays.toArray(new String[0]); // convert the set to an array

        System.out.println("Array Conversion = " + Arrays.toString(array)); // test what the set looks like
    }
}
