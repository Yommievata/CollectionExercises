package Se.Lexicon.Question7;

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

        ArrayList<String> covertedNames = new ArrayList<>();
        String[] names2 = new String[]{"Eric",  "Johansson", "Michael", "Simon", "Victor"};
        covertedNames.addAll(Arrays.asList(names2));
        System.out.println("Names Converted Manually = " + covertedNames);


    }
}
