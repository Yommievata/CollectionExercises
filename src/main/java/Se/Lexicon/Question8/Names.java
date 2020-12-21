package Se.Lexicon.Question8;

import java.util.*;

public class Names {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Victor");
        names.add("Michael");
        names.add("Johansson");
        names.add("Simon");
        names.add("Eric");

        System.out.println("Original List of Names = " + names);

        List<String> list = new ArrayList<>(names);
        Collections.sort(list);

        System.out.println("Sorted list = " + list);

    }
}

