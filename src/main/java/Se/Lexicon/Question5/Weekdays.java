package Se.Lexicon.Question5;

import java.util.HashSet;
import java.util.Set;

public class Weekdays {
    public static void main(String[] args) {
        Set<String> weekDays = new HashSet<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println("Weekdays HashSet: " + weekDays);
    }
}
