package Se.Lexicon.Question10;

import java.util.HashMap;
import java.util.Iterator;

public class Car {
    public static void main(String[] args) {
        HashMap<Integer, String> car = new HashMap<>();

        car.put(1, " Volve");
        car.put(2, " BMW");
        car.put(3, " Audi");
        car.put(4, " Toyota");
        car.put(5, " Saab");

        //Iterator<Integer> itr = car.keySet().iterator();
        //System.out.println("Entire HashMap = " + car);

        for (Integer key : car.keySet()){
            System.out.println("key = " + key);
        }

    }
}

