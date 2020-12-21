package Se.Lexicon.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeekDays {
    public static void main(String[] args) {
        ArrayList<String> weekDays =  new ArrayList<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");


        System.out.println("weekDays = " + weekDays);

        weekDays.add(3, "Thursday");

        System.out.println("Current weekDays = " + weekDays);
    }
}