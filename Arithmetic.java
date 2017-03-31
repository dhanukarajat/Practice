// Quiz 1 Program 1
public class Arithmetic {

    public static void main(String[] args) {

        int n=17,m=18;
        double result=0.0;
        
		System.out.println("Results for Arithmetic Expressions are:");
		
        result=(n/10)+(n%10);
        System.out.printf("Expression 1: %f", result);
		
		result=(n%2)+(m%2);
		System.out.printf("\nExpression 2: %f", result);
		
		result=(m+n)/2;
		System.out.printf("\nExpression 3: %f", result);
		
		result=(m+n)/2.0;
		System.out.printf("\nExpression 4: %f", result);
		
		result=(int)(0.5*(m+n));
		System.out.printf("\nExpression 5: %f", result);
		
		result=(int)(Math.round(0.5 * (m + n)));
		System.out.printf("\nExpression 6: %f", result);
    }
}
