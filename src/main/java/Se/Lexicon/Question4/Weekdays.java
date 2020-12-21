package Se.Lexicon.Question4;

import java.util.ArrayList;
import java.util.List;

public class Weekdays {
    public static void main(String[] args) {
        ArrayList<String> weekDays =  new ArrayList<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println("weekDays = " + weekDays);

        List<String> weekDays2 = weekDays.subList(0,3);

        System.out.println("Sublist Weekdays = " + weekDays2);

    }
}
