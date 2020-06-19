import java.util.Scanner;
import java.util.Arrays;

public class LessonArray {
    public static void main(String[] args) {

        // Create Scanner object input stream ready for user input.
        Scanner input = new Scanner(System.in);

        // Array gets created here for double's
        // Access to Array via myFirstArray
        // Change the last number inside [X] to change the Array size.
        // Once created this cannot change but can be accessed by myFirstArray.length
        double[] myFirstArray = new double[5];

        // User prompted to enter an amount of values determined by the Array size (myFirst.Array.length = 3).
        System.out.print("Enter " + myFirstArray.length + " values. Press Enter after each individual number: ");

        // Fills up the array with the user input.
        for (int i = 0; i < myFirstArray.length; i++)
            myFirstArray[i] = input.nextDouble();

        // Prints out the Array (String in terminal) filled with the users input. (In this case double's).
        System.out.println("String of user input value's inside myFirstArray: "+Arrays.toString(myFirstArray));
    }
}
