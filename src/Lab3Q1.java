import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab3Q1 {
//    Create an ArrayList of Integers
//    Fill each of the 10 slots with a random value from 1-50.
//    Display those values on the screen, and then prompt the user for an integer.
//    Search through the ArrayList, and if the item is present, print a message that the number is in the list.
//    If the value is not in the ArrayList, print a message that the number is not in the list
    public static void main(String[] args) {

        List<Integer> listOfInteger = new ArrayList<>();
        Random rand = new Random();

        for(int i=0;i<10;i++){
            int j = rand.nextInt(50)+1;
            listOfInteger.add(j);
        }

        System.out.print("The random 10 numbers are: ");
        listOfInteger.forEach(a-> System.out.print(a+" "));

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number you are looking for: ");
        int input = scan.nextInt();
        String result = listOfInteger.contains(input) ? "The number is in the list." : "The number is not in the list.";

        System.out.println(result);
        scan.close();
    }
}
