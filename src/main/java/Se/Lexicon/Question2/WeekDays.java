package Se.Lexicon.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class WeekDays {
        public static void main(String[] args) {
            List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");


            ListIterator<String> listIterator = weekDays.listIterator();

            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
        }
    }

