import java.util.Scanner;

public class IT24103298LAB4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use the ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is Positive" :
                        (number < 0) ? "The number is Negative" : 
			"The number is Zero":

        // Output the result
        System.out.println("The number is: " + result);

    }
}
