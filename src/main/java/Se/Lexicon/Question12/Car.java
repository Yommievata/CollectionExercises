package Se.Lexicon.Question12;

import java.util.HashMap;

public class Car {
    public static void main(String[] args) {
        Integer id;
        String brand;
        Character model;
        Car car = new Car();

        HashMap<Integer, Car> car2 = new HashMap<>();

        car2.put(1, car.clone());
        Car put = car.put(2, " BMW");
        car.put(3, " Audi");
        car.put(4, " Toyota");
        car.put(5, " Saab");



    }

}
