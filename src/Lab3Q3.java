import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lab3Q3 {
//    Make a record to store information about a car. It should contain fields for: - make (String) - model (String) - year (int)
//    Create an ArrayList of Car objects.
//    Sort the ArrayList of cars by year (Ascending) and print them out.
    public static void main(String[] args){
        List<Car> carInventory = Arrays.asList(new Car("Toyota","Camery", 2020),
                                                new Car("Ford","Escape", 2010),
                                                new Car("BMW","X3", 2015),
                                                new Car("Honda","Civic", 2016));

//        carInventory.sort(new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return Integer.compare(o1.getYear(), o2.getYear());
//            }
//        });

//        carInventory.sort((o1,o2)-> Integer.compare(o1.getYear(), o2.getYear()));

        carInventory.sort(Comparator.comparing(Car::getYear));

        carInventory.forEach(System.out::println);
    }
}