import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lab3Q2 {
//    Create an ArrayList of Integers
//    Fill the ArrayList with ten random numbers (1-50)
//    Copy each value from the ArrayList into another ArrayList of the same capacity
//    Change the last value in the first (original) ArrayList to a -5
//    Display the contents of both ArrayLists
    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        Random rand = new Random();

        for(int i=0;i<10;i++){
            int j = rand.nextInt(50)+1;
            listOfInteger.add(j);
        }

        List<Integer> newListOfInteger = List.copyOf(listOfInteger);

        listOfInteger.set(9,-5);

        listOfInteger.forEach(a-> System.out.print(a+" "));
        System.out.println();
        newListOfInteger.forEach(a-> System.out.print(a+" "));
    }
}