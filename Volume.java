// Quiz 1 Program 5
import java.util.Scanner;
import java.lang.Math;
public class Volume {

    public static void main(String[] args) {

		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare the variables
        double h1,h2,h3,r1,r2;
		double vol1,vol2,vol3,FinalVolume=0.0;
		
		//Seek user input
		//Base Cylinder Volume
		System.out.println("Enter h1 ");
		h1 = input.nextDouble();
		System.out.println("Enter r1 ");
		r1 = input.nextDouble();
		vol1 = Math.PI*h1*r1*r1;
		
		//Top Cylinder
		System.out.println("Enter h2 ");
		h2 = input.nextDouble();
		System.out.println("Enter r2 ");
		r2 = input.nextDouble();
		vol2 = Math.PI*h2*r2*r2;
		
		//Section of Cone
		System.out.println("Enter h3");
		h3 = input.nextDouble();
		vol3 = (Math.PI*h3*((r1*r1)+(r1*r2)+(r2*r2)))/3;  
		
		FinalVolume = vol1 + vol2 + vol3;
		
		System.out.printf("\nVolume of Bottle is %f",FinalVolume);
		
	}
}