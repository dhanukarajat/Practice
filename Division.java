// Quiz 1 Program 2
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {

		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare the variables
        int number;
        
		//Seek user input
		System.out.print("Enter an integer ");
		number = input.nextInt();
		
		//Check Divisibility by 2 and 3
		if (number%2==0) {
			if (number%3==0) {
				System.out.printf("\nNumber %d is divisible by both 2 and 3",number);
			}
			else {
				System.out.printf("\nNumber %d is divisible by 2, but not by 3",number);
			}		
		}
		else if (number%3==0) {
			System.out.printf("\nNumber %d is divisible by 3, but not by 2",number);
		}
		else
			System.out.printf("\nNumber %d is divisible neither by 2 nor by 3",number);
    }
}
