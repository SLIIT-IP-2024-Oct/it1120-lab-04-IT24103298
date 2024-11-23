import java.util.Scanner;
public class IT24103298LAB4Q1{

    	public static void main(String[] args)  {
 Scanner input= new Scanner(System.in);

System.out.print("Enter a number: ");
double number = input.nextDouble();

if(number >0) {
	System.out.println("the number is positive.");
}
else if (number < 0) {
	System.out.println("The number is negative.");
}
else {
	System.out.println("The number is Zero.");
}
}
}


