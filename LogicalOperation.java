// Quiz 1 Program 4
public class LogicalOperation {

    public static void main(String[] args) {
		
		int x=12,y=8,z=5;
		
		if (((x % z) < y) && (y < z))
			System.out.println("Expression 1 is True");
		else
			System.out.println("Expression 1 is False");
		
		if (((z / y) < y) || ((x / y) > z))
			System.out.println("Expression 2 is True");
		else
			System.out.println("Expression 2 is False");
	
		if ((! (x < y)) && (x > (y + z)))
			System.out.println("Expression 3 is True");
		else
			System.out.println("Expression 3 is False");
		
		if ((x > y) && (y < z))
			System.out.println("Expression 4 is True");
		else
			System.out.println("Expression 4 is False");
		
		if (!((x % y) < z))
			System.out.println("Expression 5 is True");
		else
			System.out.println("Expression 5 is False");
		
		if ((x == 4) || (y > 4))
			System.out.println("Expression 6 is True");
		else
			System.out.println("Expression 6 is False");
	}
}